import java.util.ArrayList;
import java.util.Iterator;

public class ArraysAndCollections22 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		ArrayList carCompanies = new ArrayList();

		carCompanies.add(new Company("BMW", "Germany"));
		carCompanies.add(new Company("Ford", "USA"));
		carCompanies.add(new Company("Honda", "Japan"));
		
		Iterable carCompaniesIterable = (Iterable) carCompanies;
		
		Iterator carCompaniesIterator = carCompaniesIterable.iterator();
		
		// while (carCompaniesIterator.hasNext()) {
		// 	Company company = carCompaniesIterator.next();

		// 	System.out.println("The next element is: " + company);
		// }
	}

}