package com.skillsoft.collections;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithLists15 {

	public static void main(String[] args) {
		
		List<String> programmingLanguages = new ArrayList<String>();

		programmingLanguages.add("Java");
		programmingLanguages.add("Python");
		programmingLanguages.add("C#");
		programmingLanguages.add("Go");
		
		System.out.println("Programming languages: " + programmingLanguages);
		
		for (String language : programmingLanguages) {

			System.out.println(language);
		}
	}

}