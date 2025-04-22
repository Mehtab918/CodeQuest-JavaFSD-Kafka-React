package com.skillsoft.collections;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithLists14 {

	public static void main(String[] args) {
		
		List<String> programmingLanguages = new ArrayList<String>();

		programmingLanguages.add("Java");
		programmingLanguages.add("Python");
		programmingLanguages.add("C#");
		programmingLanguages.add("Go");
		
		System.out.println("Programming languages: " + programmingLanguages);
		
		for (int i = 0; i < programmingLanguages.size(); i++) {

			System.out.println(programmingLanguages.get(i));
		}
	}

}