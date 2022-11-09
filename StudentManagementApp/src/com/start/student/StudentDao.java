package com.start.student;

import java.sql.Connection;
import java.sql.PreparedStatement;


public class StudentDao {
	public static boolean addStudent(Student st) {
		
		try {
			Connection con=ConnectionProvider.CreateCon();
			String query="INSERT INTO `studentmanagement`.`students` ( `sname`, `sphone`, `scity`) VALUES (?,?,?);" ;
			PreparedStatement pstmt=con.prepareStatement(query);
			pstmt.setString(1, st.getSname());
			pstmt.setString(2, st.getSphone());
			pstmt.setString(3, st.getSphone());
			pstmt.execute();//boolean return type 
			return true;
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}
}
