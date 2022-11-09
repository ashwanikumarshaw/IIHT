package com.start.student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class StudentDao {

	public static boolean addStudent(Student st) {

		try {
			Connection con = ConnectionProvider.CreateCon();
			String query = "INSERT INTO `studentmanagement`.`students` ( `sname`, `sphone`, `scity`) VALUES (?,?,?);";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1, st.getSname());
			pstmt.setString(2, st.getSphone());
			pstmt.setString(3, st.getSphone());
			pstmt.execute();// boolean return type
			return true;

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return false;
	}

	public static boolean deletStudent(int id) {

		try {
			Connection con = ConnectionProvider.CreateCon();
			String query = "DELETE FROM `studentmanagement`.`students` WHERE (`sid` = ?);";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setLong(1, id);

			pstmt.execute();// boolean return type
			return true;

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return false;
	}
	
	

	public static ResultSet displayStudent() {

		try {
			Connection con = ConnectionProvider.CreateCon();
			String query = "SELECT * FROM studentmanagement.students;";
			PreparedStatement pstmt = con.prepareStatement(query);
		
			ResultSet stucents=pstmt.executeQuery();
			
			return stucents;

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return null;
	}
	
}
