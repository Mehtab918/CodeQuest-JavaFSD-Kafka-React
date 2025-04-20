package com.skillsoft.collections;

import java.util.ArrayList;

public class ArraysAndCollections25 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		ArrayList carCompanies = new ArrayList();

		carCompanies.add(new Company("Honda", "Japan"));
		
		carCompanies.add("Ford");

		carCompanies.add(100);
		carCompanies.add(1.5f);
		carCompanies.add(102.4);
		
		System.out.println("Car companies: " + carCompanies);
		
		for (Object obj : carCompanies) {
			
			System.out.println("\nObject class: " + obj.getClass());
		}
	}

}