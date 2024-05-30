package concepts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnectionWithMSSQL {
	 public static void main(String[] args) throws Exception {

	        // Create a variable for the connection string.
		 	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	        String connectionUrl = "jdbc:sqlserver://THARA\\SQLEXPRESS;databaseName=BikeStores;integratedSecurity=true;encrypt=false";
//	        String user="THARA\\venka";
//	        String password="";
	        try {
	        Connection con = DriverManager.getConnection(connectionUrl);
	        		Statement stmt = con.createStatement();
	     
	            String SQL = "SELECT * FROM production.stocks";
	            ResultSet rs = stmt.executeQuery(SQL);

	            // Iterate through the data in the result set and display it.
	            while (rs.next()) {
	                System.out.println(rs.getInt("product_id"));
	            }
	        }
	        // Handle any errors that may have occurred.
	        catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
}
