package ObjectsAndClasses;

public class PatternLoops {

	public static void main(String[] args) {
		
//		 * * * * * 
//        * * * *  		
//		   * * *
//			* *
		//	 *
		
		for (int i = 0; i < 5; i ++)  // 0 spaces, 1 space, 2 spaces, 3 spaces, 4 spaces
		{
			
			
			
			for ( int c = 0; c <= i; c ++)
			{
				System.out.print(" ");
			}
			for ( int j = 5; j > i; j--)
			{
				
			System.out.print("* ");	
		
		
			}
			System.out.println();
			
		}
		

	}

}
