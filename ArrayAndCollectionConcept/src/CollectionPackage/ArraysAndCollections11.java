package CollectionPackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArraysAndCollections11 {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {

		ArrayList arrayList = new ArrayList();
		
		System.out.println("ArrayList class: " + arrayList.getClass());

		System.out.println();

		System.out.println("ArrayList instanceof List: " + (arrayList instanceof List));
		System.out.println("ArrayList instanceof Collection: " + (arrayList instanceof Collection));
		System.out.println("ArrayList instanceof Iterable: " + (arrayList instanceof Iterable));

	}

}