package com.skillsoft.collections;

import java.util.ArrayList;

public class WorkingWithLists08 {

	public static void main(String[] args) {
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		arrayList.add(100);
		arrayList.add(200);
		arrayList.add(300);
		arrayList.add(null);
		
		System.out.println("List of integers: " + arrayList);

	}

}