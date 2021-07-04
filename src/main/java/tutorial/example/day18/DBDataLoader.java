package tutorial.example.day18;

import tutorial.example.Teacher;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class DBDataLoader
{
	public static void main(String[] args) throws IOException
	{
		String fileName = "teachers.csv";
		String url = "localhost";
		int port = 5432;
		String databaseName = "postgres";
		String username = "postgres";
		String password = "postgres";

		// step1: read a file and load the data
		List<Teacher> teachers = readDataFromCsvFile(fileName);
		// step2 : insert data into the database
		saveTeachers(teachers, url, port, databaseName, username, password);
	}

	private static List<Teacher> readDataFromCsvFile(String filename) throws IOException
	{
		// 1.1 read file content
		// 1.2. for each row in the file convert it to a Java class (Teacher)
		Path path = Paths.get(filename);
		Stream<String> lines = Files.lines(path);
		List<Teacher> teachers = new ArrayList<>();
		lines.skip(1).forEach(line -> {
			Teacher teacher = convertCsvRowToTeacher(line);
			teachers.add(teacher);
		});
		return teachers;
	}

	// array: data.length  data[0]
	// list:  data.size()  data.get(0)
	public static Teacher convertCsvRowToTeacher(String line)
	{
		//"1000,Peter,White,Male,English,5,8,30000"
		String[] data = line.split(",");

		Teacher t = new Teacher();
		t.setId(Integer.valueOf(data[0]));
		t.setFirstName(data[1]);
		t.setLastName(data[2]);
		t.setGender(data[3]);
		t.setClassName(data[4]);
		t.setGrade(Integer.valueOf(data[5]));
		t.setRatings(Integer.valueOf(data[6]));
		t.setSalary(Integer.valueOf(data[7]));
		return t;
	}

	private static void saveTeachers(List<Teacher> teachers, String url, int port, String databaseName, String username,
			String password)
	{
		// 2.1  connect to db with username and pwd
		// 2.2  create a table
		// 2.3  create statement to run SQL queries (e.g insert data)
		String dbUrl = buildDataBaseurl(url, port, databaseName);
		createTable(dbUrl, username, password);
		saveData(teachers, dbUrl, username, password);
	}

	private static String buildDataBaseurl(String url, int port, String databaseName)
	{
		return "jdbc:postgresql://" + url + ":" + port + "/" + databaseName;
	}

	private static void createTable(String url, String username, String password)
	{
		String query = "create table teachers (id int primary key, first_name varchar(50), last_name varchar(50), gender varchar(16), "
				+ "class_name varchar(32), grade int, rating int, salary int)";
		try (Connection connection = DriverManager.getConnection(url, username, password);
				Statement statement = connection.createStatement())
		{
			statement.execute(query);
		}
		catch (SQLException e)
		{
			System.out.println("Error occurred: " + e.getMessage());
		}
	}

	private static void saveData(List<Teacher> teachers, String url, String username, String password)
	{
		if (teachers.isEmpty())
		{
			return;
		}

		try (Connection connection = DriverManager.getConnection(url, username, password);
				Statement statement = connection.createStatement())
		{
			teachers.forEach(t -> {
				/**
				 * insert into teachers (id, first_name, last_name, gender, class_name, grade, rating, salary) values (
				 *  1000, 'Peter', 'White', 'Male', 'English', 5, 8, 30000
				 * )
				 */
				String query =
						"insert into teachers (id, first_name, last_name, gender, class_name, grade, rating, salary) values ("
								+ t.getId() + ", '" + t.getFirstName() + "', '" + t.getLastName() + "', '" + t.getGender() + "', '"
								+ t.getClassName() + "', " + t.getGrade() + ", " + t.getRatings() + ", " + t.getSalary() + ")";
				try
				{
					statement.execute(query);
				}
				catch (SQLException e)
				{
					System.out.println("Error occurred when saving data: " + e.getMessage());
				}
			});
		}
		catch (SQLException e)
		{
			System.out.println("Error occurred: " + e.getMessage());
		}
	}
}
