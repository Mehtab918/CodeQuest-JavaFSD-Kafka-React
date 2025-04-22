package com.skillsoft.collections;

public class WorkingWithLists10 {

	public static void main(String[] args) {
		
		Collection<Company> list = new ArrayList<Company>();
		
		list.add(new Company("Walmart", "USA"));
		list.add(new Company("Tesco", "UK"));
		list.add(new Company("Reliance", "India"));

		System.out.println("List of companies: " + list);
		System.out.println();

		Iterable<Company> listIterable = (Iterable<Company>) list;
		
		Iterator<Company> listIterator = listIterable.iterator();
		
		while (listIterator.hasNext()) {
			
			// NOTE: No casting required when working with generics.
			Company company = listIterator.next();

			System.out.println("The next element is: " + company);

		}
		System.out.println();

		// NOTE: Every object of the list is of the same data type.
		for (Company company : listIterable) {
			System.out.println("For loop over an iterable: " + company);
		}
		System.out.println();

		// NOTE: The list implements the Iterable<Company> interface.
		for (Company company : list) {
			System.out.println("For loop over a list: " + company);
		}
		System.out.println();

	}

}