import java.sql.*;
import java.util.Scanner;

public class User {

	  static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	  static final String DB_URL = "jdbc:mysql://localhost:3306/abhishekdb";
	  static final String USER = "root";
	  static final String PASS = "root";
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc = new Scanner(System.in);
		    System.out.println("Enter the value for id: ");
		    int ids = sc.nextInt();
		    System.out.println("Enter the value for name: ");
		    String names = sc.next();
		    
		try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS))
	    {
	      System.out.println("Connected to the database");
	      Statement stmt = conn.createStatement();
	      String sql = "INSERT INTO test101 (id, name) VALUES ("+ids+",'" +names+ "')";
	      stmt.executeUpdate(sql);
	      System.out.println("Table created successfully");
	    }
	    catch(SQLException e)
	    {
	      System.err.println("Connection failed");
	      e.printStackTrace();
	    }
	}

}
