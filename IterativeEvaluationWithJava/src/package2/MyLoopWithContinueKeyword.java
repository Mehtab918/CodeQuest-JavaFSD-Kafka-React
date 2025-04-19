package package2;

public class MyLoopWithContinueKeyword {

	public static void main(String[] args) {
		
		for(int i= 1; i<=10;i++)
		{
			System.out.println(i);
			if(i==6)
			{
				System.out.println("printing when i=6");
							
			}
			continue;
		}
		System.out.println("the loop continues outside the loop ");
	}
}
