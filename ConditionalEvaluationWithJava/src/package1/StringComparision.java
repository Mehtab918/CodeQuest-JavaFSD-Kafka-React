package package1;

import java.util.Scanner;

public class StringComparision {

	public static void main(String[] args) {
		
		System.out.println("Enter first name: ");
		Scanner sc = new Scanner(System.in);
		
		String userInput = sc.nextLine();
		
		String name1 = userInput;
		String name2 = name1;  //poiting to same object in scp
		
		String name3 = new String(name1);  // another object created in heap memory with name1 value as pointing  name3 ..
		
		if(name1.equals(name2))
		{
			System.out.println(name1 + " and " + name2 + " are equals.");
		}
		else
		{
			System.out.println(name1 + " and " + name2 + " are not equals.");
		}
		
		System.out.println("------");
		
		if(name1.equals(name3))
		{
			System.out.println(name1 + " and " + name3 + " are equals.");
		}
		else
		{
			System.out.println(name1 + " and " + name3 + " are not equals.");
		}
		
	}
}
