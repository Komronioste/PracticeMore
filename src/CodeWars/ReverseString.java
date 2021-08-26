package CodeWars;

public class ReverseString {

	
	public static String solution(String str) {
	    
	    String str2 ="";
	   char[] chars = str.toCharArray();
	    for ( int i = str.length()-1; i >=0; i--)
	      
	    str2 = str2 + (chars[i]);
	    
	    return str2;
	}
	    
	    
	    public static String boolToWord(boolean b)
	    {
	      String answer = "";
	      
	       if (b = true)
	        answer = "Yes";
	      
	      else
	        answer = "No";
	      
	      return answer;
	    }
	    
	    public static int countSheeps(Boolean[] arrayOfSheeps) {

	        int sheep=0;
	        
	        for ( int i = 0; i < arrayOfSheeps.length; i++)
	        
	          if (arrayOfSheeps[i] == true)
	           
	            sheep += 1;
	        
	        else if (arrayOfSheeps[i] == null)
	          sheep +=0;
	        
	        else sheep +=0;
	        
	        return sheep;
	      }    
	  
	
	
	
	public static void main(String[] args) {
		
		
		Boolean[] arr = {true, false, true, false, false, true, true, true,true, false, true};
		
		System.out.println(countSheeps(arr));
		
		
		
		
		solution("HelloWorld");
		
		System.out.println(solution("Hello World"));
		
		String a = "abc";
		a = a +25;
		System.out.println(a);
		
		
		System.out.println(boolToWord(true));
		
		String ajk = "Hello";
		ajk = "Bye";
		System.out.println(ajk);
	}

}
