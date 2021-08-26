package CodeWars;

import java.util.Arrays;

public class InitialsFromString {

	public static void main(String[] args) {


		String name = "Sam Harris";
		
		String [] words = name.split(" ");
	    
	    String initials = words[0].substring(0,1) + "." + words[1].substring(0,1);
	    
	    System.out.println(initials);

	    
	    Object[] haystack = {"3", "123124234", null, "needle", "world", "hay", 2, "3", true, false};
	    
	    String result = "found the needle at position ";
	    
	    
	    for ( int i = 0; i < haystack.length; i ++)
	        
	    {	if ( haystack[i] == "needle")
	          result = result + i;
	    }
	    
	    System.out.println(result);
	    System.out.println(Arrays.asList(haystack).indexOf("needle"));
	}

}
