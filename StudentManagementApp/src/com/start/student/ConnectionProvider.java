package com.start.student;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
	Connection con;
	public void CreateCon() {
		try {
			Class.forName("com.mysql.jdbc.driver");
			String user="root";
			String password="pass@word1";
			String url="http://localhost:3306/studentmanagement";
			con=DriverManager.getConnection(url, user, password);
			
		}catch (Exception e) {
			System.out.println(e);
		}
	}
}
