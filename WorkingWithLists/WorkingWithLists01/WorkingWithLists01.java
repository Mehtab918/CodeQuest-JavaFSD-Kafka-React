package com.skillsoft.collections;

import java.util.ArrayList;

public class WorkingWithLists01 {
	
	public static void main(String[] args) {

		ArrayList<String> carCompanyStringList = new ArrayList<String>();

		carCompanyStringList.add("Ford");
		carCompanyStringList.add("Toyota");
		
		System.out.println("Car companies (strings): " + carCompanyStringList);

//		carCompanyStringList.add(new Company("Honda", "Japan"));
//		carCompanyStringList.add(new Company("Tata", "India"));

		System.out.println("Car companies: " + carCompanyStringList);
		
		ArrayList<Company> carCompanyList = new ArrayList<Company>();
		
		carCompanyList.add(new Company("Honda", "Japan"));
		carCompanyList.add(new Company("Tata", "India"));
		
		System.out.println("Car companies (objects): " + carCompanyList);
		
//		carCompanyList.add("Toyota");

	}

}