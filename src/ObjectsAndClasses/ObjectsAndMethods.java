package ObjectsAndClasses;

import java.util.Scanner;

public class ObjectsAndMethods {


void largers(int a, int b) 
{
	if (a>b)
	{
		System.out.println(a + " is larger");
	}
	else {System.out.println(b + " is larger"); }
}

void evenORodd(int c)
{
	if (c%2==1)
	{
		System.out.println(c + " is odd");
			}
	else if (c%2==0)
	{
		System.out.println(c + " is even");
	}
	else {System.out.println(c + " is zero!");}
}
	
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		ObjectsAndMethods num = new ObjectsAndMethods();
		
		int num1 =10, num2;
		num.largers(num1 = scan.nextInt(), num2 = scan.nextInt());
		
		
		num.evenORodd(0);
		
	}

}
