package com.oop;

public class Yamaha {
	
	public static void main(String[] args) {
		//we are creating sn object of the Encapsulation instance
		Bike yh=new Bike();
		yh.setCC(150);
		yh.setColor("Blue");
		yh.setName("Yamaha FZ");
		yh.setPrice(5870000);
		System.out.println(yh.getName());
	}

}
