package com.oop;

public class HR extends Employees {// child class
	Integer Bonus = 2500;
	Integer total = Bonus + BaseSalary;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dev aish = new Dev();
		System.out.println("Total Salary of aish :" + aish.total);
		
		HR arnab=new HR();
		arnab.TotalSalary(arnab.BaseSalary, arnab.Bonus);
				
	}

}