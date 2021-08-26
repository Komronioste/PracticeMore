package ObjectsAndClasses;

public class toCharArray {

	public static void main(String[] args) {
		
		String str = "Today is Monday and I hate it";
		
		String[] split = str.split(" ");
		
		char[] chars;
		
		for (String x : split)    // x represents every word inside the str.  
			// need to print every letter of x backwards.
		{	
		for (int i = x.length()-1; i >=0; i--)
		{
			chars = x.toCharArray();
			System.out.print(chars[i] + " ");
		}
		System.out.print( " ");
		}

	}

}
