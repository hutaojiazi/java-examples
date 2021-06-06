package tutorial.example.day8;

import tutorial.example.Teacher;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ReadFile
{
	public static void main(String[] args) throws IOException
	{

		String fileName = "teachers.csv";

		readFile(fileName);

//		String headers = "ID,FIRSTNAME,LASTNAME,GENDER,CLASS,GRADE,RATING,SALARY";
//
//		Teacher teacher1 = new Teacher("Peter", "White", "Male", 5, "English", 8, 30000);
//		Teacher teacher2 = new Teacher("Sophie", "Black", "Female", 3, "French", 10, 50000);
//		Teacher teacher3 = new Teacher("Bob", "Green", "Male", 1, "Science", 5, 80000);
//		Teacher teacher4 = new Teacher("Emma", "Legrand", "Female", 6, "Music", 7, 45000);
//		Teacher teacher5 = new Teacher("Linda", "Lepetit", "Female", 2, "Art", 9, 61000);
//		List<Teacher> teachers = List.of(teacher1, teacher2, teacher3, teacher4, teacher5);
//
//		/**
//		 * ID,FIRSTNAME,LASTNAME,GENDER,CLASS,GRADE,RATING,SALARY
//		 * 1,Peter,White, .......80000
//		 * 2,Sophie,Black
//		 * 3,Bob,.........
//		 */
//
//		// UUID: 11111111-1111-1111-11111111111  <0-9><a-f>
//
//		StringBuilder sb = new StringBuilder();
//		sb.append(headers);
//
//		for (Teacher t : teachers)
//		{
//			sb.append("\n").append(UUID.randomUUID().toString()).append(",").append(t.toCsvRow());
//		}
//
//		writeToFile(sb.toString(), fileName);
	}

	/**
	 *
	 * b63ecb3f-d332-4f05-81e6-49767ce55297,Peter,White,Male,English,5,8,30000

	 data[0] = ID
	 data[1] = FRISTNAME
	 data[2] = LASTNAME
	 ...
	 ....
	 */

	// array: data.length  data[0]
	// list:  data.size()  data.get(0)
	public static Teacher convertCsvRowToTeacher(String line)
	{
		String[] data = line.split(",");

		Teacher t = new Teacher();
		t.setFirstName(data[1]);
		t.setLastName(data[2]);
		t.setGender(data[3]);
		t.setClassName(data[4]);
		t.setGrade(Integer.valueOf(data[5]));
		t.setRatings(Integer.valueOf(data[6]));
		t.setSalary(Integer.valueOf(data[7]));
		return t;
	}

	public static void readFile(String fileName) throws IOException
	{
		Path path = Paths.get(fileName);
		Stream<String> lines = Files.lines(path);
		lines.skip(1).forEach(line -> {
			Teacher teacher = convertCsvRowToTeacher(line);
			System.out.println(teacher);
		});
	}

	public static void writeToFile(String text, String fileName) throws IOException
	{
		Path path = Paths.get(fileName);
		byte[] strToBytes = text.getBytes();
		Files.write(path, strToBytes);
	}
}
