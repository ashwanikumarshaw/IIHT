package com.oop;

public class TV {
	String brand;
	String modelname;
	Integer screensize;
	Integer price;
	Integer color;
	String displaytype;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  TV lg=new TV();
		  lg.brand="LG";
		  lg.modelname="4k oled";
		  lg.screensize=55;
		  lg.price=60000;
		  lg.displaytype="Oled";
		  System.out.println(lg.brand+" "+lg.modelname);

	}

}
