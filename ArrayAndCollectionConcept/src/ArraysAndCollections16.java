package com.skillsoft.collections;

import java.util.ArrayList;
import java.util.Collection;

public class ArraysAndCollections16 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		Collection carCompanies = new ArrayList();

		carCompanies.add("BMW");
		carCompanies.add("Ford");
		carCompanies.add("Honda");

		System.out.println("Car companies: " + carCompanies);

	}

}