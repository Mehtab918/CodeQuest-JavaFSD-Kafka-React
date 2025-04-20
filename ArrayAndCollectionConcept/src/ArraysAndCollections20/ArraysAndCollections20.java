package com.skillsoft.collections;

import java.util.ArrayList;
import java.util.Collection;

public class ArraysAndCollections20 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		Collection carCompanies = new ArrayList();


		carCompanies.add("BMW");
		carCompanies.add("Ford");
		
		carCompanies.add(5);
		carCompanies.add(5.5);
		
		System.out.println("Car companies list (with primitive types): " + carCompanies);
		System.out.println();

		carCompanies.add(new Company("Honda", "Japan"));
		carCompanies.add(new Company("General Motors", "USA"));
		
		System.out.println("Car companies list (with custom objects): " + carCompanies);
		System.out.println();

	}

}