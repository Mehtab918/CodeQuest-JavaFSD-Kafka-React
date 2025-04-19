package package1;

import java.util.Scanner;

public class MyClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println("Enter number between 1 to 4:");
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		if(num == 1)
		{
			System.out.println("physics");
		}
		else if(num == 2)
		{
			System.out.println("maths");
		}
		else if(num == 3)
		{
			System.out.println("chemistry");
		}
		else if(num == 4)
		{
			System.out.println("computer science");
		}
		else
		{
			System.out.println("invalid subject");
		}
		
		sc.close();
	}

}
