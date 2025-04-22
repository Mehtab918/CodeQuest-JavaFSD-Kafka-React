package CollectionPackage;

import java.util.ArrayList;
import java.util.Collection;

public class ArraysAndCollections15 {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {

		Collection carCompanies = new ArrayList();

		carCompanies.add("BMW");
		carCompanies.add("Ford");
		carCompanies.add("Honda");

		System.out.println("Cars : " + carCompanies);

	}

}