package CollectionPackage;

public class ArraysAndCollections03 {

	public static void main(String[] args) {

		int[] numArray = {10, 20, 30, 40};

		System.out.println("Using a *for* loop to access array elements");

		for (int i = 0; i < numArray.length; i++) {
			
			System.out.println("Element at index " + i + " : " + numArray[i]);
		}
		System.out.println();

		System.out.println("Using a *for-each* loop to access array elements");
		
		for (int elem : numArray) {
			System.out.println("Element " + elem);
		}

	}

}