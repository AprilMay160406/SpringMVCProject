package Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class UserConnection {
	
	public static void main(String[] args)  {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jwd-57\", \"root\",\"root");
		System.out.println("success");
		
		} catch (ClassNotFoundException e) {
			System.out.println("Driver error" + e.getMessage());
		} catch (SQLException e) {
			System.out.println("Connection error" + e.getMessage());
					}
	}

	

}
