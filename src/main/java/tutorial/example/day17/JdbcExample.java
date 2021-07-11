package tutorial.example.day17;

import tutorial.example.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Performs multiple operations (create table, insert, update, delete and select) in the database.
 */
public class JdbcExample
{
	private final String url = "jdbc:postgresql://localhost:5432/postgres";
	private final String user = "postgres";
	private final String password = "postgres";

	private static final String createTableSql = "CREATE TABLE users (ID INT PRIMARY KEY, NAME TEXT, EMAIL VARCHAR(50), COUNTRY VARCHAR(50), PASSWORD VARCHAR(50))";
	private static final String insertDataSql1 = "insert into users (id, name, email, country, password) values (1000, 'tom vincent', 'tom@google.com', 'Canada', 'abc123')";
	private static final String insertDataSql2 = "insert into users (id, name, email, country, password) values (1001, 'brad peter', 'brad@google.com', 'USA', '111111')";
	private static final String updateDataSql = "update users set password = 'qwert' where id = 1000";
	private static final String deleteDataSql = "delete from users where id = 1000";

	private static final String fetchDataSql = "select id, name, email, country, password from users";

	public static void main(String[] args) throws SQLException
	{
		JdbcExample app = new JdbcExample();

		// step1: create a db table
		//app.createTable();

		// step2: insert data
		//app.insertData(insertDataSql1, insertDataSql2);

		// step2.1 update data
		//app.updateData(updateDataSql);

		// step2.2 delete data
		app.deleteData(deleteDataSql);

		// step3: fetch data and display
		app.fetchData(fetchDataSql);
	}

	private void createTable()
	{
		//System.out.println(createTableSql);
		// Step 1: Establishing a Connection
		// Step 2:Create a statement using connection object
		// Step 3: Execute the query or update query
		try (Connection connection = DriverManager.getConnection(url, user, password);
				Statement statement = connection.createStatement())
		{
			statement.execute(createTableSql);
		}
		catch (SQLException e)
		{
			System.out.println("Error occurred: " + e.getMessage());
		}
	}

	private void insertData(String... sql)
	{
		try (Connection conection = DriverManager.getConnection(url, user, password);
				Statement statement = conection.createStatement())
		{
			for (int i = 0; i < sql.length; i++)
			{
				//System.out.println(sql[i]);
				statement.execute(sql[i]);
			}
		}
		catch (SQLException e)
		{
			System.out.println("Error occurred: " + e.getMessage());
		}
	}

	private void updateData(String sql)
	{
		try (Connection connection = DriverManager.getConnection(url, user, password);
				Statement statement = connection.createStatement())
		{
			statement.execute(sql);
		}
		catch (SQLException e)
		{
			System.out.println("Error occurred: " + e.getMessage());
		}
	}

	private void deleteData(String sql)
	{
		try (Connection connection = DriverManager.getConnection(url, user, password);
				Statement statement = connection.createStatement())
		{
			statement.execute(sql);
		}
		catch (SQLException e)
		{
			System.out.println("Error occurred: " + e.getMessage());
		}
	}

	private List<User> fetchData(String sql)
	{
		System.out.println(sql);
		List<User> users = new ArrayList<>();
		try (Connection conection = DriverManager.getConnection(url, user, password);
				Statement statement = conection.createStatement())
		{
			ResultSet result = statement.executeQuery(sql);
			while (result.next())
			{
				User user = new User();
				user.setId(result.getInt("id"));
				user.setName(result.getString("name"));
				user.setCountry(result.getString("country"));
				user.setEmail(result.getString("email"));
				user.setPassword(result.getString("password"));
				users.add(user);
			}
		}
		catch (SQLException e)
		{
			System.out.println("Error occurred: " + e.getMessage());
		}

		return users;
	}

}
