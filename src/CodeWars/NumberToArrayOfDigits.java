package CodeWars;

public class NumberToArrayOfDigits {

	public static void main(String[] args) {


//		int[] array = null;
//		
//		int number = 43243;
//		
//	while (number >= 1) {
//		for (int i = 0; ; i++) {
//			array[i] = number%10;
//		}
//		
//	}
		int digit = 0;
		int number = 43243;
		
		while (number >= 1)
		{
			number = number%10;
		}
		
	System.out.println(number);
		
//		String str = number.toString();
//		
//		char[] digits = str.toCharArray();
//		
//		for (int i : digits) {
//			System.out.print(i + " ");
//		}
		
	}

}
