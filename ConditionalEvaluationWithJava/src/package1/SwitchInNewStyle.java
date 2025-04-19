package package1;

import java.util.Scanner;

public class SwitchInNewStyle {

	public static void main(String[] args) {
		
		
		System.out.println("Enter month number:");
		Scanner monthInput = new Scanner(System.in);
		
		int month = monthInput.nextInt();
		
		
//		switch(month)
//		{
//		
//		case 3 : System.out.println(month +" is the quarter end of the year.");
//		break;
//		
//		case 6 : System.out.println(month + " is the quarter end of the year.");
//		break;
//		
//		case 9 : System.out.println(month +" is the quarter end of the year.");
//		break;
//		
//		case 12 : System.out.println(month + " is the quarter end of the year.");
//		break;
//		
//		
//		default: System.out.println("invalid month number."); 
//		break;
//		}
//	
		switch(month)
		{
		case 3:
		case 6:
		case 9 : 
		case 12 : System.out.println(month + " is the quarter end of the year.");
		break;
		
		
		default: System.out.println("invalid month number."); 
		break;
				
	}
		monthInput.close();
	}
}
