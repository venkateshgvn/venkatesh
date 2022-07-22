package org.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC {
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		 Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","1754");
		
		String s ="select * from employees";
		
		PreparedStatement u = connection.prepareStatement(s);
		
		ResultSet t = u.executeQuery();
		
		while(t.next()) {
			String n = t.getString("first_name");
			String n = t.getString("first_name");
			System.out.println(n);
			System.out.println("updated value");
			System.out.println("updated value3");
		}
		
		connection.close();
		}
	
	
		
}




	


