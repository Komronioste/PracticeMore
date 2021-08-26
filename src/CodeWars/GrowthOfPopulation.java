package CodeWars;

public class GrowthOfPopulation {

	public static int nbYear(int p0, double percent, int aug, int p) {
        int years= 0;
  
     
     while (p0 <= p)														//while  1500 <= 5000
       { p0  += (p0*percent)/100 + aug;									// 1500 + 75 + 100;
       																//	years = 1;
        																	// while 1675 < 5000
          years ++;
       }
     
     return years;
   }
	
	
	
	public static void main(String[] args) {



		System.out.println(nbYear(1500, 5, 100, 5000));
		
		
	}

}
