package package1;

import java.util.Scanner;
public class MyClass {

	public static void main(String[] args) {
	
		char  grade;
		
		System.out.println("Enter marks:");
		Scanner sc = new Scanner(System.in);
		
		int marks = sc.nextInt();
		
		sc.close();
		
		if(marks>0 && marks<=40)
		{
			grade='D';
		}
		else if(marks>=41 && marks<=59)
		{
			grade ='C';
		}
		else if(marks>=60 && marks<=70)
		{
				grade ='B';
		}
		else {
			grade ='A';
		 }
		System.out.println("Score is :"+ marks + " and " + "grade is :" + grade);
	}

}
