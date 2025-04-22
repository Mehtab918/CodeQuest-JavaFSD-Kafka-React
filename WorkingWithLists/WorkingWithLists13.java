package com.skillsoft.collections;

import java.util.ArrayList;
import java.util.Collection;

public class WorkingWithLists13 {

	public static void main(String[] args) {
		
		Collection<String> list = new ArrayList<String>();

		list.add("Walmart");
		list.add("Tesco");
		list.add("Reliance");
		
		System.out.println("Companies: " + list);
		
//		String s = list.get(1);
//		System.out.println("\nCompany at index 1: " + s);
//		
//		s = list.get(2);
//		System.out.println("Company at index 2: " + s);
//
//		list.add(1, "Loblaw Companies");
//		System.out.println("\nCompanies (after adding 1 element): " + list);
//		
//		list.add(1, "More Supermarkets");
//		System.out.println("\nCompanies (after adding 2 elements): " + list);
//
//		list.set(0, "Whole Foods");
//		System.out.println("\nCompanies (after setting element at index 0): " + list);
//		
//		list.add(2, "More Supermarkets");
//		list.add(2, "More Supermarkets");
//		
//		System.out.println("\nCompanies (after adding duplicates): " + list);
//
//		int index = list.indexOf("More Supermarkets");
//		System.out.println("\n'More Supermarkets' found at index: " + index);
//
//		index = list.indexOf("more supermarkets");
//		System.out.println("\n'more supermarkets' found at index: " + index);
//
//		index = list.lastIndexOf("More Supermarkets");
//		System.out.println("\n'More Supermarkets' found at last index: " + index);
//
//		index = list.indexOf("more supermarkets");
//		System.out.println("\n'more supermarkets' found at last index: " + index);
	}

}