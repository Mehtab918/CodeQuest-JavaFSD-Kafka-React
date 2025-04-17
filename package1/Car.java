package package1;

import java.util.Scanner;
public class Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the car price for checking:");
		
		Scanner sc = new Scanner(System.in);
		
		int priceOfCar = sc.nextInt();
		
		System.out.println("Price of the car :" + priceOfCar);
		
//		if(priceOfCar <=10000)
//		{
//		System.out.println("price of the car is affordable");
//		System.out.println("completed");
//		}
//		else
//		{
//			System.out.println("Its very expensive");
//		}
		
		// if- else condition is useful for basic expresiion.
		// introducing trinary operation when we need to work on nested if else condition.
		// writing the same logic through trinart operator will make the sense of executing expression.
		
		
		// so lets commenting the above if else block .
		
		
//		String result = (priceOfCar<=1000)?"Affordable":"very expensive";
//		
//		System.out.println(result);
		
		
	String result1 = (priceOfCar<=10000)?"affordable":(priceOfCar>=10000 && priceOfCar<=20000)?"Slightly expensive":
					 (priceOfCar>=30000 && priceOfCar<=40000)?"Expensive":"very Expensive";
	
	System.out.println(result1);
	}

}
