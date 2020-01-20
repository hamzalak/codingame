//package codinGame;
import java.util.* ;
import java.math.* ;  

public class Methods {

	static boolean check(int i, int j) {
		return (i == 1 || j == 1) || i + j == 1;
	}

	static int joinPoint(int i1, int i2) {

		String s1 = Integer.toString(i1);
		int[] tab1 = new int[s1.length()];
		for (int i = 0; i < s1.length(); i++) {
			tab1[i] = (int) s1.charAt(i);
			System.out.println(tab1[i]);
		}
		return 0;
	}

	static int joinPoint2(int i1) {

		int res = i1;
		int tmp = 0;
		while (i1 > 0) {
			tmp = (i1 % 10);
			i1 = (i1 - tmp) / 10;
                        System.out.println(res) ; 
			res += tmp;
		}

		return res;
	}

	static int sumRange(int[] ints) {
		/*int sum = 0;
		for (int i = 0; i < ints.length; i++) {
			int n = ints[i];
			if (n >= 10 && n <= 1000000)
				sum += n;
		}
		return sum;
            */
              return  Arrays.stream(ints).filter((val)-> val >= 10 && val<=100).sum() ; 
	}

	static boolean check(String str) {
		if ("".equals(str))
			return true;

		if (str.indexOf("()") == -1 && str.indexOf("[]") == -1)
			return false;

		while (str.indexOf("()") != -1)
			str = str.replace("()", "");

		while (str.indexOf("[]") != -1)
			str = str.replace("[]", "");

		return check(str);

	}

	static int findLargest(int[] tab) {

		int res = 0;

		for (int i = 0; i < tab.length; i++) {
			if (tab[i] > res) {
				res = tab[i];
			}
		}
		return res;

	}
	
	static boolean isPrime(int n) {
		
		if(n==2) {
			return true;
			//System.out.println("prime");
	}	
		
		else {
			
			for (int i=2; i<(int) Math.sqrt(n)+1; i++) {
				
				if(n%i==0) {
					return false;
				}
			}	
		}
		return true;
	}


	static boolean isFoo(String param){
		if (param=="foo")
		return true;
		else
		return false;
	}
        
       static int findClosest(int[] ints ){
         int abs = 0 ;   
         int min = Integer.MAX_VALUE    ; 
         for(int i = 0 ; i < ints.length-2 ; i++){
               abs = Math.abs(ints[i]) ;  
               if(abs < min){
                    min =  abs ;  
                 }
            }
  
        return min ;  
      } 


	public static void main(String[] args) {

		/*Methods m = new Methods();
		System.out.println(m.joinPoint2(6));
                System.out.println(m.isFoo("lom"));*/
              //   byte val = 50 ;  // Working with bytes ???
                 //val = (byte) (val >> 2) ;
              //   System.out.println(val);
                // ArrayList  arr = new ArrayList(2) ; 
                 //arr.add(2) ; arr.add(2) ;
                // System.out.println(arr.size())  ;
              int[] l = {-30,4,9,12,98,10,10, -10, -2, -1,Integer.MAX_VALUE, 1 } ;  
             
              int[] maxTest = new int[100000] ; 
               
              System.out.println(sumRange(l)) ;               

	}
}
