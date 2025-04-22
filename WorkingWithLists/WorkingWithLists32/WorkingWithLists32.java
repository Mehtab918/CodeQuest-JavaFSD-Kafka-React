package com.skillsoft.collections;

public class WorkingWithLists32 {

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
		
		Company anotherHonda = new Company("Honda", "Japan");
		Company anotherTata = new Company("Tata", "India");
		
		System.out.println("\nCompanies contains another Honda?: " + companies.contains(anotherHonda));
		System.out.println("Companies contains another Tata?: " + companies.contains(anotherTata));

		// Run
		
		companies.remove(honda);
		System.out.println("\nCompanies without Honda: " + companies);

		// Run

		companies.remove(anotherTata);
		System.out.println("\nCompanies list will no longer include Tata: " + companies);
	}

}