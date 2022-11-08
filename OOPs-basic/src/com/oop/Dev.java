package com.oop;

class Employees {
	Integer BaseSalary = 50000;// parent class
}

public class Dev extends Employees {// child class
	Integer Bonus = 2500;
	Integer total = Bonus + BaseSalary;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dev Ashu = new Dev();
		System.out.println("Total Salary of Ashu :" + Ashu.total);
	}

}
