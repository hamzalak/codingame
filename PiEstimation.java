package game.code;

public class PiEstimation {

	
	static double approx( double[][] pts) {
		
		int l =  0  ; 
		for(int i = 0 ; i< pts.length ; i++ ) {
			if(pts[i][1]*pts[i][1]+pts[i][0]*pts[i][0]<=  1) {
				l++ ; 
			}
		}
	  System.out.println(l) ;
	  return (4*(double)l/pts.length) ; 
	}
	
	public static void main(String args[]) {
 
	double[][] points = new double[100000][2] ; 
	//System.out.println(points.length) ;
	
	  for(int i  = 0 ; i< points.length ; i++) {
		   points[i][1] =   Math.random() ;
		   points[i][0] =   Math.random() ; 
	  }
	  
	  System.out.println(approx(points)); 
 	
	}
}
