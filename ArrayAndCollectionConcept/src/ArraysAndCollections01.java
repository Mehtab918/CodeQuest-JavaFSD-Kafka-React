package com.skillsoft.collections;

public class ArraysAndCollections01 {

	public static void main(String[] args) {

		int[] intArray = new int[4];

		intArray[0] = 10;
		intArray[1] = 20;
		
		System.out.println("Array of integers: " + intArray);
		System.out.println("toString() representation: " + intArray.toString());
		System.out.println("getClass() representation: " + intArray.getClass());
		
		System.out.println();
		
		float[] floatArray = new float[4];

		floatArray[0] = 10.5f;
		floatArray[1] = 20.5f;

		System.out.println("Array of floats: " + floatArray);
		System.out.println("toString() representation: " + floatArray.toString());
		System.out.println("getClass() representation: " + floatArray.getClass());
		
		System.out.println();

		String[] stringArray = new String[4];

		stringArray[0] = "Hello";
		stringArray[1] = "World";

		System.out.println("Array of strings: " + stringArray);
		System.out.println("toString() representation: " + stringArray.toString());
		System.out.println("getClass() representation: " + stringArray.getClass());
		
		System.out.println();

		System.out.println("intArray instanceof Object: " + (intArray instanceof Object));
		System.out.println("floatArray instanceof Object: " + (floatArray instanceof Object));
		System.out.println("stringArray instanceof Object: " + (stringArray instanceof Object));

		
	}

}