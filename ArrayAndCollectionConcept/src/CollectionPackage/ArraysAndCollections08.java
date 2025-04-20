package CollectionPackage;

public class ArraysAndCollections08 {

	public static void main(String[] args) {

		Object[] objectArray = new Object[4];

		objectArray[0] = 10;
		objectArray[1] = 20.4;
		objectArray[2] = 30.5f;
		objectArray[3] = "Forty";

		for (int i = 0; i < objectArray.length; i++) {

			System.out.println("Element at index " + i + " : " + objectArray[i] + 
					" class: " + objectArray[i].getClass());
		}
		
	}

}