package com.skillsoft.collections;

import java.util.ArrayList;
import java.util.Collection;

public class ArraysAndCollections18 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		Collection carCompanies = new ArrayList();

		carCompanies.add("BMW");
		carCompanies.add("Ford");
		carCompanies.add("Honda");
		carCompanies.add("General Motors");

		System.out.println("Car companies: " + carCompanies);
		System.out.println("Number of elements in the list: " + carCompanies.size());
		
		System.out.println();
		
		carCompanies.remove("Ford");
		carCompanies.remove("Honda");

		System.out.println("Car companies (updated): " + carCompanies);
		System.out.println("Number of elements in the list (updated): " + carCompanies.size());
		System.out.println();
		
		carCompanies.remove("Ford");
		System.out.println("Car companies (after removing Ford again): " + carCompanies);
		
	}

}