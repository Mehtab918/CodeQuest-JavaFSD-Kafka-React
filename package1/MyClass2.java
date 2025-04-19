//nested if else - leap year example
package package1;

import java.util.Scanner;

public class MyClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter a year to check whether the year is come under leap year or not:");
		Scanner sc= new Scanner(System.in);
		
		int year = sc.nextInt();
		
		sc.close();
		
		if(year % 4 == 0)
		{
		if(year % 100 == 0 )
			{
				if(year % 400 == 0)
				{
					System.out.println("it is a leap year ");
				}
				else
				{
					System.out.println("it is not a leap year");
				}
			}
			else
			{
				System.out.println("it is a leap year");
			}
		}
		else
		{
			System.out.println("it is not a leap year");
		}

	}

}
