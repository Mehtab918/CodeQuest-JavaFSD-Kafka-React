import java.util.Arrays;

public class LimitationsOfArray {

	public static void main(String[] args) {
		
		
		int[] intArray = new int[4];  // fixed in size
		
		intArray[0] = 10;
		intArray[1] = 20;
		
		System.out.println(intArray.length);
		
		System.out.println(intArray.toString());
		
		System.out.println("Arrays toString:" + Arrays.toString(intArray));
		
		intArray[2] = 30;
		intArray[3] = 40;
		
		System.out.println(Arrays.toString(intArray));
	}
}
