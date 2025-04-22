package CollectionPackage;

import java.util.ArrayList;
import java.util.Collection;

public class ArraysAndCollections17 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		Collection carCompanies = new ArrayList();

		carCompanies.add("BMW");
		carCompanies.add("Ford");
		carCompanies.add("Honda");

		System.out.println("Car companies: " + carCompanies);
		System.out.println();
		
		carCompanies.add("General Motors");

		System.out.println("Car companies (including General Motors): " + carCompanies);
		System.out.println();
		
		System.out.println("Number of elements: " + carCompanies.size());

		carCompanies.add("Daimler AG");
		System.out.println();

		System.out.println("Car companies (including Daimler AG): " + carCompanies);
		System.out.println("Number of elements (including Daimler AG): " + carCompanies.size());

		carCompanies.add("Daimler AG");
		System.out.println();

		System.out.println("Car companies (Daimler AG present twice): " + carCompanies);
		System.out.println("Number of elements (Daimler AG present twice): " + carCompanies.size());
		
	}

}