package com.skillsoft.collections;

import java.util.ArrayList;

public class WorkingWithLists11 {

	public static void main(String[] args) {
		
		ArrayList<Company> list = new ArrayList<Company>(3);
		
		System.out.println("Is the list empty: " + list.isEmpty());
		System.out.println("Size of the list: " + list.size());
		
		list.add(new Company("Walmart", "USA"));
		list.add(new Company("Tesco", "UK"));
		
		System.out.println("\nIs the list empty (after adding elements): " + list.isEmpty());
		System.out.println("Size (after adding elements): " + list.size());

		list.add(new Company("Reliance", "India"));
		
		// NOTE: ArrayList internally implements a growable dynamic array which means 
		// it can increase and decrease its size automatically. 
		// The details of the growth policy are not specified beyond the fact that 
		// adding an element has constant amortized time cost.

		list.add(new Company("Loblaw Companies", "Canada"));

		System.out.println("\nSize (list expands to accommodate elements): " + list.size());

		// NOTE: Can increase the capacity of an ArrayList instance before adding a large number of 
		// elements using the ensureCapacity operation
		list.ensureCapacity(1000);
		
		list.add(new Company("More Supermarkets", "India"));
		
		System.out.println("\nSize (no resize under the hood): " + list.size());

	}

}