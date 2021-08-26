package CodeWars;

public class TwoMiddleLetters {

	public static String getMiddle(String word) {

//	     String result = "";
//	     for ( int = 0; i < word.length(); i ++) 
//	     {
	      
	    if (word.length()%2==0)
	      return word.substring(word.length()/2-1, word.length()/2+1);
	    
 else 
	      
return word.substring(word.length()/2, word.length()/2+1);
	  }
	
	
	public static void main(String[] args) {
		
		System.out.println(getMiddle("Bulba"));


	}

}
