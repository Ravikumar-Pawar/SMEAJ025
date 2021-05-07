package com.mysql.jdbc.com;

//step 1
import java.sql.*;

public class MysqlCon {

	public static void main(String[] args) 
	
	{
		String url = "jdbc:mysql://localhost:3306/Database_name";
		String uname = "root";
		String pass ="Yourname@1010";
		String query = "select * from logindetails";
		
		try {
			//step 2 --load drivers
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//step 3 -- start connect to database pass parameters 
			Connection connection = DriverManager.getConnection(url, uname, pass);
			
			//step 4 -- SQL statement
			Statement statement = connection.createStatement();
			
			//step 5 -- Execute Query
			ResultSet rs = statement.executeQuery(query);
			//statement.executeUpdate(query);
			
			
			
			//cursor pointing to iterate data
			while(rs.next()) {
				String username = rs.getString("userName");
				String password = rs.getString("pass_word");
				System.out.println("user Name: "+username);
				System.out.println("password: "+password);	
			}
			
			//step 6---close statement and connection
			statement.close();
			connection.close();
			
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
	}
}
