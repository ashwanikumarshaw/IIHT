package com.start;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.start.student.Student;

public class Start {

	public static void main(String[] args) throws IOException {
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
				
				System.out.println(stu);
			}else if(choice==2) {
				//delete
				
			}else if(choice==3) {
				//display
				
			}else if(choice==4) {
				//exit
				break;
			}else {
				
			}
		}
		
		System.out.println("Thanks for using Student mangement");
	}

}
