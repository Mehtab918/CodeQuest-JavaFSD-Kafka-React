package CarPriceCheckProject;

import java.util.Scanner;
public class Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the car price for checking:");
		
		Scanner sc = new Scanner(System.in);
		
		int priceOfCar = sc.nextInt();
		
		System.out.println("Price of the car :" + priceOfCar);
		
		if(priceOfCar <=10000)
		{
		System.out.println("price of the car is affordable");
		System.out.println("completed");
		}
		else
		{
			System.out.println("Its very expensive");
		}
	}

}
