import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {

	public static Connection getConnection() {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/smejdbc";
			String uname = "pcuser";
			String pass = "antonyr5052";

			Connection con = DriverManager.getConnection(url, uname, pass);
			return con;
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
		
	}

}
