//nested if else 
package package1;

import java.util.Scanner;
public class MyClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		sc.close();
		
		if(num==0)
		{
			System.out.println("num is zero");
		}
		else
		{
			if(num>0)
			{
				System.out.println("num is positive");
			}
			else
			{
				System.out.println("num is negative");
			}
		}
	}

}
