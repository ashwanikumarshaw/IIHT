package com.oop;

public class Student {

	Integer id;
	String name;
	Address address;
	//Encapsulation
	public void addStudent(Integer id, String name, Address address) {

		this.id = id;
		this.name = name;
		this.address = address;
	}
	void displayStudent() {
		System.out.println(name+" "+address.city+" "+address.country);
	}
	public static void main(String[] args) {
		Address johnAddress=new Address("Bangalor","Karnatak","India");
		
		Student john=new Student();
		john.addStudent(101, "John Smith", johnAddress);
		john.displayStudent();
	}
}
