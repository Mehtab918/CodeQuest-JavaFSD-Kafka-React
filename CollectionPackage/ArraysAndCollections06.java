package CollectionPackage;

public class ArraysAndCollections06 {

	public static void main(String[] args) {

		int[] numArray = new int[4];

		numArray[0] = 10;
		numArray[1] = 20;
		numArray[2] = 30;
		numArray[3] = 40;
		numArray[4] = 50;

		for (int i = 0; i < numArray.length; i++) {

			System.out.println("Element at index " + i + " : " + numArray[i]);
		}

	}

}