package com.skillsoft.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WorkingWithLists17 {

	public static void main(String[] args) {
		
		List<String> programmingLanguages = new ArrayList<String>();

		programmingLanguages.add("Java");
		programmingLanguages.add("Python");
		programmingLanguages.add("C#");
		programmingLanguages.add("Go");
		
		System.out.println("Programming languages: " + programmingLanguages);
		
		Iterator<String> iterator = programmingLanguages.iterator();
		
		
		while (iterator.hasNext()) {

			String language = iterator.next();
			
			System.out.println(language);
		}
	}

}