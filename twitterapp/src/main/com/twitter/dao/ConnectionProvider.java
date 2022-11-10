package main.com.twitter.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
	static Connection con;
	public static Connection CreateCon() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String user="root";
			String password="pass@word1";
			String url="jdbc:mysql://localhost:3306/studentmanagement";
			con=DriverManager.getConnection(url, user, password);
			
		}catch (Exception e) {
			System.out.println(e);
		}
		return con;
	}
	
}
