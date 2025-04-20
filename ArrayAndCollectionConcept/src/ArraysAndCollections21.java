package com.skillsoft.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraysAndCollections21 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		ArrayList carCompanies = new ArrayList();

		carCompanies.add("BMW");
		carCompanies.add("Ford");
		carCompanies.add("General Motors");
		
		Iterable carCompaniesIterable = (Iterable) carCompanies;
		
		Iterator carCompaniesIterator = carCompaniesIterable.iterator();
		
		System.out.println("Has next element?: " + carCompaniesIterator.hasNext());
		System.out.println("The next element is: " + carCompaniesIterator.next());
		System.out.println();
		
		System.out.println("Has next element?: " + carCompaniesIterator.hasNext());
		System.out.println("The next element is: " + carCompaniesIterator.next());
		System.out.println();

		System.out.println("Has next element?: " + carCompaniesIterator.hasNext());
		System.out.println("The next element is: " + carCompaniesIterator.next());
		System.out.println();
		
		System.out.println("Has next element?: " + carCompaniesIterator.hasNext());
		System.out.println("The next element is: " + carCompaniesIterator.next());
		System.out.println();
		
	}

}