
public class ArrayConcept {

	public static void main(String[] args) {
		
		
		int[] intArray1 = new int[3];
		
		intArray1[0] = 10;
		intArray1[1] = 20;
		
		System.out.println("array for Integer:" +  intArray1);
		System.out.println("toString representation :" + intArray1.toString()); // array is an object
		System.out.println("get class representation:" + intArray1.getClass());
		
		
		System.out.println("--------");
		
		float floatArray[] = new float[3];
		floatArray[0] = 23.4f;
		floatArray[1] = 12.4f;
		
		System.out.println("array for float :" +  floatArray);
		System.out.println("toString representation :" + floatArray.toString()); // array is an object
		System.out.println("get class representation:" + floatArray.getClass());
		
		System.out.println("--------");
		
		String stringArray[] = new String[3];
		
		stringArray[0] = "Hello";
		stringArray[1] = "world";
		
		System.out.println("array for String :" +  stringArray);
		System.out.println("toString representation :" + stringArray.toString()); // array is an object
		System.out.println("get class representation:" + stringArray.getClass());
		
		System.out.println("----------");
		
		
		System.out.println("Is integer instance of Object ? " + intArray1 instanceof Object);
		System.out.println("Is float instance of Object ? " + floatArray instanceof Object);
		System.out.println("Is String instance of Object ? " + stringArray instanceof Object);
	}
}
