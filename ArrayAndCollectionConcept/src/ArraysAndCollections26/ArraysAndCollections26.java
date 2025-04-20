package com.skillsoft.collections;

import java.util.ArrayList;

public class ArraysAndCollections26 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		ArrayList carCompanies = new ArrayList();

		carCompanies.add(new Company("Honda", "Japan"));
		carCompanies.add(new Company("Tata", "India"));
		
		carCompanies.add("Ford");
		carCompanies.add("Toyota");
		
		System.out.println("Car companies: " + carCompanies);
		
		for (Object obj : carCompanies) {
			
			Company company = (Company) obj;
			
			System.out.println("\nName: " + company.getName());
			System.out.println("Country: " + company.getCountry());
		}
	}

}