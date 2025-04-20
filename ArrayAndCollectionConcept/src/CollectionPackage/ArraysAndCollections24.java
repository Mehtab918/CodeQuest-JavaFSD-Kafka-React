package CollectionPackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArraysAndCollections24 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		Collection carCompanies = new ArrayList();

		carCompanies.add("BMW");
		carCompanies.add("Ford");
		carCompanies.add("Honda");
		
		System.out.println("Car companies: " + carCompanies);
		
		List carCompaniesList = (List) carCompanies;
		System.out.println("Company at index 1: " + carCompaniesList.get(1));
		System.out.println("Company at index 2: " + carCompaniesList.get(2));
		
		carCompaniesList.add(1, "Toyota");
		carCompaniesList.add(2, "Volkswagon");
		
		System.out.println("\nCar companies (updated): " + carCompanies);
		System.out.println("\nCompany at index 1 (updated): " + carCompaniesList.get(1));
		System.out.println("Company at index 2 (updated): " + carCompaniesList.get(2));
		System.out.println("Company at index 3 (updated): " + carCompaniesList.get(3));
		
		carCompaniesList.remove(1);
		System.out.println("\nCar companies (after removal): " + carCompanies);
		System.out.println("\nCompany at index 1 (after removal): " + carCompaniesList.get(1));
		System.out.println("Company at index 2 (after removal): " + carCompaniesList.get(2));
		
	}

}