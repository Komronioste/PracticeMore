package CodeWars;

public class replaceABC {

	
	 public static String switcheroo(String x) {
		   
	     String newStr = "";
	    
	    char[] chars = x.toCharArray();
	    for (int i = 0; i < chars.length; i++)
	      {
	      if (chars[i] == 'a')
	          {
	            chars[i] = 'b';
	          }
	      else if (chars[i] == 'b')
	            {
	            chars[i] = 'a';
	      }
	      }
	      
	      for (int j = 0; j < chars.length; j ++)
	        newStr = newStr + chars[j];
	      
	    
	    return newStr;
	  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String what = switcheroo("abbc");
		System.out.println(what);
		
		
	}

}
