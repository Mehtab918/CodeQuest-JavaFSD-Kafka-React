package com.skillsoft.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class WorkingWithLists26 {

	public static void main(String[] args) {
		
		List<String> programmingLanguages = new ArrayList<String>();

		programmingLanguages.add("Java");
		programmingLanguages.add("Python");
		programmingLanguages.add("C#");
		programmingLanguages.add("Go");
		
		System.out.println("Programming languages: " + programmingLanguages);
		
		
		ListIterator<String> listIterator = programmingLanguages.listIterator();
		
		while (listIterator.hasNext()) {
			
			String language = listIterator.next();
			
			if (language.equals("Go")) {
				listIterator.set("Golang");
			}
		}

		System.out.println("Programming languages (after update): " + programmingLanguages);

	}

}