package ObjectsAndClasses;

import java.util.Scanner;

public class Album {

	public static String song(String name, String duration)
	{
		return name.concat(", ").concat(duration);
	}
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int digit = 1;
		for (int i = 1; i <=10; i++)
		{
			
			System.out.print(digit + ". " + song(scan.next(), scan.next()));
		
			
			digit+=1;
			
			
			for (int j = 1; j <=10; j++)
			{
				
			}
		}
		
		
	}

}
