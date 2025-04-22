package com.skillsoft.collections;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithLists30 {

	public static void main(String[] args) {

		List<String> programmingLanguages = new ArrayList<String>();

		programmingLanguages.add("Java");
		programmingLanguages.add("Python");
		programmingLanguages.add("C#");
		programmingLanguages.add("Golang");
		programmingLanguages.add("JavaScript");
		programmingLanguages.add("C");
		programmingLanguages.add("C++");
		
		System.out.println("Programming languages: " + programmingLanguages);

		System.out.println("\nProgramming languages contains Golang?: " + 
				programmingLanguages.contains("Golang"));
		System.out.println("\nProgramming languages contains Go?: " + 
				programmingLanguages.contains("Go"));
		
		programmingLanguages.remove("Golang");

		System.out.println("\nProgramming languages contains Golang (after removal)?: " + 
				programmingLanguages.contains("Golang"));

	}

}