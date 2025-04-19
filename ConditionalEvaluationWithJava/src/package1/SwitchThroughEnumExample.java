package package1;

import java.util.Scanner;

public class SwitchThroughEnumExample {

	enum Subjects
	{ 
		Physics,
		Chemistry,
		Biology,
		Mathematics
		
	}
	enum Topics
	{
		Algebra,
		Statistics,
		Probability
	}
	
	public static void main(String[] args) {
		
		System.out.println("Enter a subject for 0: Physics , 1: chemistry ,2: Biology , 3 :Mathematics");
		Scanner sc = new Scanner(System.in);
		
	  String subject = sc.nextLine();
	  
	  sc.close();
	  int subjectInt = Integer.parseInt(subject);
	  
	  switch(Subjects.values()[subjectInt])
	  {
	  case Physics : System.out.println("Main subject is Physics");
	  break;
	  
	  case Chemistry : System.out.println("Main subject is Chemistry");
	  break;
	  
	  case Biology : System.out.println("Main subject is Biology");
	  break;
	  
	  case Mathematics : System.out.println("Main subject is Mathematics");
	  	
	  	System.out.println("Enter a sub topics for Mathematics  0: Algebra , 1: Statistics ,2: Probability");
		Scanner sc1 = new Scanner(System.in);
		String subTopics = sc.nextLine();
		sc1.close();
		int subtopicInt = Integer.parseInt(subTopics);
		
		switch(Topics.values()[subtopicInt])
		{
			case Algebra : System.out.println("sub topic is Algebra");
			break;
			
			case Statistics : System.out.println("sub topic is Statistics");
			break;
			
			case Probability : System.out.println("sub topic is Probability");
			break;
			
		}
		
	  
	  break;
	  
	  default : System.out.println("invalid subjects");
	  break;
	  
	  }
	}
}
