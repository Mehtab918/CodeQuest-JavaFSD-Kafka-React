package com.skillsoft.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;


public class ArraysAndCollections19 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		Collection carCompanies = new ArrayList();

		System.out.println("Car companies (initial list): " + carCompanies);
		System.out.println("Car companies isEmpty(): " + carCompanies.isEmpty());
		System.out.println();

		carCompanies.add("BMW");
		carCompanies.add("Ford");
		carCompanies.add("Honda");
		carCompanies.add("General Motors");

		System.out.println("Car companies (added companies): " + carCompanies);
		System.out.println("Car companies isEmpty(): " + carCompanies.isEmpty());
		System.out.println();
		
		System.out.println("contains BMW: " + carCompanies.contains("BMW"));
		System.out.println("contains bmw: " + carCompanies.contains("bmw"));
		System.out.println();

		carCompanies.remove("BMW");
		System.out.println("contains BMW (after removal): " + carCompanies.contains("BMW"));
		System.out.println();

		Collection anotherList = new ArrayList();
		
		anotherList.add("Honda");
		anotherList.add("Ford");
		
		System.out.println("Car companies: " + carCompanies);
		System.out.println("Another list: " + anotherList);
		
		System.out.println("carCompanies.containsAll(anotherList): " + 
				carCompanies.containsAll(anotherList));
		System.out.println();
		
		Object[] objectArray = carCompanies.toArray();
		System.out.println("Object array toString(): " + objectArray.toString());
		System.out.println("Object array elements: " + Arrays.toString(objectArray));
		
	}

}