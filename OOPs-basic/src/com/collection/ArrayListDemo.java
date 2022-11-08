package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> name=new ArrayList<>();
		name.add("Ashu");
		name.add("Ash");
		name.add("Aish");
		name.add("sajeed");
		System.out.println(name);
		
		Iterator itr=name.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
