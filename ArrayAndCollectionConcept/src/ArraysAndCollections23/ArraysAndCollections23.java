package ArraysAndCollections23;

import java.util.ArrayList;

public class ArraysAndCollections23 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		ArrayList carCompanies = new ArrayList();

		carCompanies.add(new Company("BMW", "Germany"));
		carCompanies.add(new Company("Ford", "USA"));
		carCompanies.add(new Company("Honda", "Japan"));
		
		Iterable carCompaniesIterable = (Iterable) carCompanies;
		
		// NOTE: The Collection interface implements the Iterable interface
		// which is what allows us to use the for-each loop to iterate over
		// the elements of the collection
		for (Object obj : carCompaniesIterable) {
			
			Company company = (Company) obj;
			
			System.out.println("\nName: " + company.getName());
			System.out.println("Country: " + company.getCountry());

		}
		
	}

}