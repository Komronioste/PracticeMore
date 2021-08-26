package projects;

import java.util.Scanner;

public class WheelOfFortune {

	public static String secretWord;
	public static String guess;
	public static String hidden;
	
	
	static Scanner scan = new Scanner(System.in);
	public static void correctGuess(String a)
	{
		hidden = secretWord.replaceAll("[a-z]" , "*");
		
		for (int i = 1; i < secretWord.length(); )
		{
			if (secretWord.contains(a))
			{
				System.out.println("Great! There is: " + guess);
				i++;
				
				System.out.println(hidden);
				
				System.out.println("Guess the next letter");
				guess = scan.next();
				correctGuess(guess);
			
			}
			else {
				System.out.println("Oops. There is no " + guess + " in this word" );
				System.out.println("But go ahead and take another guess!");
				guess = scan.next();
				correctGuess(guess);
			}
			}
		
		
//		if (secretWord.contains(a))
//		{
//			System.out.println("Great! There is: " + guess);
//			System.out.println("Guess the next letter");
//			guess = scan.next();
//			
//			if (secretWord.contains(guess))
//			{
//				System.out.println("Great! There is: " + guess);
//			}
//			else
//			{
//				System.out.println("Oops. There is no " + guess + " in this word" );
//				System.out.println("But go ahead and take another guess!");
//				guess = scan.next();
//				
//				if (secretWord.contains(guess))
//				{
//					System.out.println("Great! There is: " + guess);
//			
//		}
//		else { 
//			System.out.println("Oops. There is no " + guess + " in this word" );
//			System.out.println("But go ahead and take another guess!");
//			guess = scan.next();
//			
//			if (secretWord.contains(guess))
//			{
//				System.out.println("Great! There is: " + guess);
//			}
//			else
//			{
//				System.out.println("Oops. There is no " + guess + " in this word" );
//				System.out.println("But go ahead and take another guess!");
//				guess = scan.next();
//				
//				if (secretWord.contains(guess))
//				{
//					System.out.println("Great! There is: " + guess);
//				}
//		}
//		}
//			}
		}
	
	
	
	
	public static void main(String[] args) {
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("What will be our secret word?");
		
		secretWord = scan.next();
		
		
		hidden = secretWord.replaceAll("[a-zA-Z]", "*");          // hiding the word
		
		char[] rightLetters = secretWord.toCharArray();

		System.out.println("Please guess your first letter");
		guess = scan.next();
		
		correctGuess(guess);
		
		System.out.println(hidden);
		
	
}
}
