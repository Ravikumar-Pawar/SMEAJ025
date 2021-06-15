package jdbc;

import java.sql.*;
import java.io.*;

public class DBConnection {
	public static void main(String[] args)

	{
		String url = "jdbc:mysql://localhost:3306/jframe";
		String uname = "root";
		String pass = "root";

		try {
			// step 2 --load drivers
			Class.forName("com.mysql.cj.jdbc.Driver");

			// step 3 -- start connect to database pass parameters
			Connection connection = DriverManager.getConnection(url, uname, pass);

			// step 4 -- SQL statement
			Statement statement = connection.createStatement();

			// step 5 -- Execute Query

			// statement.executeUpdate(query);
			ResultSet rs = statement.executeQuery("select * from register");

			// cursor pointing to iterate data
			while (rs.next()) {
				String username = rs.getString("uname");
				System.out.println("User Name: " + username);

			}

			// step 6---close statement and connection
			statement.close();
			connection.close();

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
