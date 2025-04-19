package package1;

import java.util.Scanner;

public class SwitchCaseIntro {

	public static void main(String[] args) {
		
		System.out.println("Enter number between 1 to 4:");
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		switch(num)
		{
		case 1 : System.out.println("physic"); break;
		case 2 : System.out.println("math"); break;
		case 3 : System.out.println("chemistry"); break;
		case 4 : System.out.println("computer science"); break;
		default : System.out.println("invalid subject"); break;
		}
		
		sc.close();
	}
}
