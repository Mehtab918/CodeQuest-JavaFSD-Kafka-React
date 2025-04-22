package CollectionPackage;

import java.util.Arrays;

public class ArraysAndCollections02 {

	public static void main(String[] args) {

		int[] numArray = new int[4];

		numArray[0] = 10;
		numArray[1] = 20;
		
		System.out.println("Array of numbers: " + numArray);
		System.out.println("toString() representation: " + numArray.toString());
		
		System.out.println();
		
		System.out.println("Elements: " + Arrays.toString(numArray));
		System.out.println();

		System.out.println("Length: " + numArray.length);
		System.out.println("Elements: (unassigned elements default to 0)" + Arrays.toString(numArray));
		System.out.println();
		
		numArray[2] = 30;
		numArray[3] = 40;

		System.out.println("Length (remains unchanged): " + numArray.length);
		System.out.println("Elements: " + Arrays.toString(numArray));
		System.out.println();
	}

}
