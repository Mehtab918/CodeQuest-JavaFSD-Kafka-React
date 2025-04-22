package com.skillsoft.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class WorkingWithLists24 {

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
			
			if (language.equals("Python")) {
				System.out.println("Current language: " + language);
				System.out.println("Next index: " + listIterator.nextIndex());
				System.out.println("Previous index: " + listIterator.previousIndex());
			}
		}


	}

}