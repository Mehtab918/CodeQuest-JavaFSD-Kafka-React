package com.skillsoft.collections;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithLists33 {

	public static void main(String[] args) {

		List<Company> companiesList1 = new ArrayList<Company>();

		Company honda = new Company("Honda", "Japan");
		Company tata = new Company("Tata", "India");
		
		companiesList1.add(honda);
		companiesList1.add(tata);

		List<Company> companiesList2 = new ArrayList<Company>();

		Company ford = new Company("Ford", "USA");
		Company bmw = new Company("BMW", "Germany");
		
		companiesList2.add(ford);
		companiesList2.add(bmw);
		
		System.out.println("\nIs companiesList1 equal to companiesList2: " + 
				companiesList1.equals(companiesList2));
				
		List<Company> companiesList3 = new ArrayList<Company>();

		Company anotherHonda = new Company("Honda", "Japan");
		Company anotherTata = new Company("Tata", "India");

		companiesList3.add(anotherHonda);
		companiesList3.add(anotherTata);
		
		System.out.println("\nIs companiesList1 equal to companiesList3: " + 
				companiesList1.equals(companiesList3));
		
		List<Company> companiesList4 = new ArrayList<Company>();
		
		companiesList4.add(anotherTata);
		companiesList4.add(anotherHonda);

		System.out.println("\nIs companiesList1 equal to companiesList4: " + 
				companiesList1.equals(companiesList4));
	}

}