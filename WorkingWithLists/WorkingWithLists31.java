package com.skillsoft.collections;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithLists31 {

	public static void main(String[] args) {

		List<Company> companies = new ArrayList<Company>();

		Company honda = new Company("Honda", "Japan");
		Company tata = new Company("Tata", "India");
		Company ford = new Company("Ford", "USA");
		Company bmw = new Company("BMW", "Germany");
		
		companies.add(honda);
		companies.add(tata);
		companies.add(ford);
		companies.add(bmw);

		System.out.println("\nCompanies contains Honda?: " + companies.contains(honda));
		System.out.println("\nCompanies contains BMW?: " + companies.contains(bmw));
		
		Company anotherHonda = new Company("Honda", "Japan");
		Company anotherTata = new Company("Tata", "India");
		
		System.out.println("\nCompanies contains another Honda?: " + companies.contains(anotherHonda));
		System.out.println("\nCompanies contains another Tata?: " + companies.contains(anotherTata));
		
		companies.remove(honda);
		System.out.println("\nCompanies without Honda: " + companies);

		companies.remove(anotherTata);
		System.out.println("\nCompanies list still includes Tata: " + companies);
	}

}