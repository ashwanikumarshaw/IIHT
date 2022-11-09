package com.start;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.start.student.Student;
import com.start.student.StudentDao;

public class Start {

	public static void main(String[] args) throws IOException, SQLException {
		System.out.println("App running...");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			System.out.println("press 1 to add a student");
			System.out.println("press 2 to delete a student");
			System.out.println("press 3 to display a student");
			System.out.println("press 4 to exit the app");
			int choice=Integer.parseInt(br.readLine());
			if(choice==1) {
				//add
				System.out.println("Student name: ");
				String name=br.readLine();
				System.out.println("Student phone no.:");
				String phone=br.readLine();
				System.out.println("Student city:");
				String city=br.readLine();
				Student stu=new Student(name,phone,city);
				
				System.out.println(stu.toString());
				
				if(StudentDao.addStudent(stu)) {
					System.out.println("Inserted");
				}else System.out.println("Error occurred ");
				
			}else if(choice==2) {
				//delete
				System.out.println("Student id: ");
				int id=Integer.parseInt(br.readLine());
				if(StudentDao.deletStudent(id)) {
					System.out.println("Deleted");
				}else System.out.println("Error occurred ");
				
			}else if(choice==3) {
				//display
				System.out.println("Student  are: ");
				ResultSet stu = StudentDao.displayStudent();
				 while (stu.next()) {
					 // `sname`, `sphone`, `scity`
					 	System.out.println("Student id: "+stu.getString("sid"));
					 
						System.out.println("Student name: "+stu.getString("sname"));
						
						System.out.println("Student phone no.:"+stu.getString("sphone"));
					
						System.out.println("Student city:"+stu.getString("scity"));
						
						System.out.println("-------------------------------------");
				 }
				
			}else if(choice==4) {
				//exit
				break;
			}else {
				
			}
		}
		
		System.out.println("Thanks for using Student mangement");
	}

}
