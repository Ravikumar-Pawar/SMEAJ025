package jdbc;
import java.sql.*;
import java.io.*;
public class DBConnection {
public static void main (String[] args) 
			
			{
				String url = "jdbc:mysql://localhost:3306/bank jdbc";
				String uname = "root";
				String pass ="malini";
				//String query = "insert into divya1 values(12,\"Kavya\",\"kavya123@gmail.com\");";
				
				try {
					//step 2 --load drivers
					Class.forName("mysql.cj.jdbc.Driver");
					
					//step 3 -- start DBConnectionect to database pass parameters 
					DBConnectionection DBConnectionection = DriverManager.getDBConnectionection(url, uname, pass);
					
					//step 4 -- SQL statement
					Statement statement = DBConnectionection.createStatement();
					
					//step 5 -- Execute Query
					
					
					//statement.executeUpdate(query);
					ResultSet rs = statement.executeQuery("select * from register");
					
					
					//cursor pointing to iterate data
					while(rs.next()) {
						String username = rs.getString("uname");
						String email = rs.getString("email");
						System.out.println("userid:"+rs.getString("userid"));
						System.out.println("user Name: "+username);
						System.out.println("email: "+email);	
					}
					
					//step 6---close statement and DBConnectionection
					statement.close();
					DBConnectionection.close();
					
				}
				catch (Exception e) {
					System.out.println(e);
				}
				
			}

	}


