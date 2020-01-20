import java.util.* ; 

public class StepStep {
	
	/** Computes the position of the​​​​​​‌​​​‌​​‌‌‌​‌‌‌‌​​‌​​‌​‌​​ dancer. */
	static int getPositionAt(int n) {
         
	  int[] arr = {0,1,-1,-4,-5,-3} ; 	
              
        return arr[n%6] ; 
	}

   
	public static void main(String... args) {
		
		System.out.println(getPositionAt(100000)) ;
		System.out.println(Planet.MERCURY.equals(Planet.MERCURY)) ; 
	}

}
class Fatou{
	private String lo = "" ; 
	
}
enum Planet{
	
	MERCURY, VENUS, EARTH 
}



    
    
