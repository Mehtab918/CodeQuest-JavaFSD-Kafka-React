package package1;

public class MyLoop1WithbreakKeyword {

	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++)
		{
			System.out.println( "i" +" = " +i);
		}
		
		System.out.println("----------");
		
		for(int i=1; i<=10; i=i+10)
		{
			System.out.println( "i" +" = " +i);
		}
		
		System.out.println("----update of the for loop may happens but we should keep increment of any value should be in last of for loop ------");
		
		int i= 1;
		for(; i<=10;)
		{
			System.out.println( "i" +" = " +i);
			i++;
		}
		
		System.out.println("----infinite loops - is like a threat . incounter ------");
		
	
//		for(; ;)
//		{
//			System.out.println( "i" +" = " +i);
//			i++;
//		}
		
		System.out.println("break keyword is used to break the loop of an for loop also.");
		
//		for(int j =1; j<=10;i++)
//		{
//			System.out.println( "j" +" = " +j);
//			break;
//		}
//		System.out.println("the for loop execution breaks and came outside.");
//		
		
//		for(int j = 1; j<=10;j++)
//		{
//			System.out.println(j);
//			if(j==6)
//			{
//				System.out.println("breaking with this value of j and go outside.");
//				break;
//			}
//		}
//		System.out.println("for loop executes and came outside.");
		
		
//		for(int j = 1; j<=10;j++)
//			{
//				if(j==6)
//				{
//					System.out.println("breaking with this value of j=" +j+" and go outside.");
//					break;
//				}
//				System.out.println(j);
//			}
//			System.out.println("for loop executes and came outside.");
		
		for(int j=1; j<=10;j++)
		{
			if(j>3)
			{
				System.out.println(j);
				break;
				//System.out.println("DO i have the rights to execute after break? .-NO NEVER");
			}
		}
	}
}
