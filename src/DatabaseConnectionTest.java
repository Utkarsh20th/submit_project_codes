import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnectionTest {

	public static void main(String[] args) {
		
		String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/emsystem";
		String username = "root";
		String password = "root";
		
		try {
		Class.forName(JDBC_DRIVER);     // old: [com.mysql.jdbc.Driver]   new: [com.mysql.cj.jdbc.Driver]
		Connection conn = DriverManager.getConnection(url,username,password);
		System.out.println("DB Connection Successful!!!");
			
		}
		catch (SQLException e) {
			System.out.println("DB Connection Failed!!!");
			
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
			
		}
		finally {
			
			
		}

	}

}
