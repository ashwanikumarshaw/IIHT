package com.oop;

public class TV {
	String brand;
	String modelname;
	Integer screensize;
	Integer price;
	Integer color;
	String displaytype;

	void insertData(String b, String m, Integer s, Integer p, Integer c, String d) {

		brand = b;
		modelname = m;
		screensize = s;
		price = p;
		color = c;
		displaytype = d;
	}

	void displayTV() {
		System.out.println(brand + " " + modelname);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV lg = new TV();
		lg.brand = "LG";
		lg.modelname = "4k oled";
		lg.screensize = 55;
		lg.price = 60000;
		lg.displaytype = "Oled";
		System.out.println(lg.brand + " " + lg.modelname);

		TV samsung = new TV();
		samsung.displayTV();
		samsung.insertData("Samsung", "LO12", 52, 87897, 5, "LED");
		samsung.displayTV();

	}

}
