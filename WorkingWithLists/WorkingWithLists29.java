package com.skillsoft.collections;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithLists29 {

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

		System.out.println("\nProgramming languages [0, 2]: " + programmingLanguages.subList(0, 3));
		
		System.out.println("\nProgramming languages [1, 5]: " + programmingLanguages.subList(1, 5));
		
		List<String> subList = programmingLanguages.subList(1, 6);
		
		System.out.println("\nProgramming languages sub list: " + subList);
		
		subList.set(0, "Python 3.7");

		System.out.println("\nProgramming languages sub list (after update): " + subList);
		System.out.println("\nProgramming languages (original list after update): " + programmingLanguages);

	}

}