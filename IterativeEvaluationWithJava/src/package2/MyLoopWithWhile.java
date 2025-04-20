package package2;

public class MyLoopWithWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		int i =1;
//		while(i<=10)
//		{
//			System.out.println("i " + "=" + i + " " );
//			i++;
//		}
//		
//		System.out.println("--------");
//		
//		int j =5;
//		while(j <= 100)
//		{
//			System.out.println("j " + "=" + j + " " );
//			j= j+10;
//		}
//		
//		System.out.println("--------");
//		
//		
//		int k = 10;
//		
//		while( k >= 1)
//		{
//			System.out.println("k =" + k);
//			k--;
//		}
//		
		
		
		String fruits[] = {"apple","banana","chikoo","Tomato","grapes","watermelon"};
		
		int i1= 0;
		
		while(i1<fruits.length)
		{
			if(fruits[i1].equals("tomato"))
			{
				System.out.println("i dislike tomato, so breaking out with this fruits.");
				
				break;
				
			}
			
		}
		
		System.out.println(fruits[i1]);
		i1++;
	}

}
