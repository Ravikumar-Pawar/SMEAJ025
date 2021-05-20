package com.mysql.jdbc.com;

//step 1
import java.sql.*;



public class MysqlCon {

	public static void main(String[] args) 
	
	{
		String url = "jdbc:mysql://localhost:3306/jdbc_training";
		String uname = "ravi";
		String pass ="";
		//String query = "delete from logindetails where userName='ravi';";
		String q = "insert into logindetails values (?, ?)";
		try {
			//step 2 --load drivers
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//step 3 -- start connect to database pass parameters 
			Connection connection = DriverManager.getConnection(url, uname, pass);
			
			//step 4 -- SQL statement
			Statement statement = connection.createStatement();
			PreparedStatement pstmt = connection.prepareStatement(q);			
			//step 5 -- Execute Query
			//statement.executeUpdate(query);
			pstmt.setString(1, "xyz");
			pstmt.setString(2, "123");
			
			pstmt.executeUpdate();
			
			//statement.executeUpdate(query);
			
			String query1="select * from logindetails";
			ResultSet rs = statement.executeQuery(query1);
		
			
			//cursor pointing to iterate data
			while(rs.next()) {
				String username = rs.getString("username");
				String password = rs.getString("password");
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
