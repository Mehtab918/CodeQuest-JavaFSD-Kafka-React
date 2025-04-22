package com.skillsoft.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class WorkingWithLists09 {

	public static void main(String[] args) {
		
		Collection<Integer> list1 = new ArrayList<Integer>();
		
		list1.add(0);
		list1.add(100);
		list1.add(200);

		System.out.println("First list of integers: " + list1);

		Collection<Integer> list2 = new LinkedList<Integer>();
		
		list2.add(300);
		list2.add(400);
		list2.add(500);
		list2.add(600);
		
		System.out.println("Second list of integers: " + list2);

		list1.addAll(list2);
		System.out.println("\nFirst list of integers (updated): " + list1);
		System.out.println("First list contains 100: " + list1.contains(100));
		System.out.println("First list contains all elements in the second list: " + 
				list1.containsAll(list2));

		list2.remove(300);
		list2.remove(400);

		System.out.println("\nSecond list of integers (after removal): " + list2);
		
		// NOTE: Removing from the second list does not affect the first list!
		System.out.println("\nFirst list of integers (still the same): " + list1);

		Collection<Integer> list3 = new ArrayList<Integer>(list1);
		System.out.println("\nThird list of integers (the same as the first list): " + list3);
		
		list1.removeAll(list2);
		System.out.println("\nSecond list: " + list2);
		System.out.println("First list (nothing in common with the second list): " + list1);
		
		list3.retainAll(list2);
		System.out.println("\nSecond list: " + list2);
		System.out.println("Third list (contains only elements in the second list): " + list3);

	}

}