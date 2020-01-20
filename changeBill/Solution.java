public class Solution {
    static Change optimalChange(String s){
    long money = Long.parseLong(s) ; 
    long[]  result1 = new long[3] ;
    if(money%10==0){
      Change.bill10 = money/10 ; 
    }else if((money%10)%5==0 || (money%10)%2==0 || ((money%10)%5)%2==0){
       result1 =  bills(money) ; 
       Change.bill10 =  result1[0] ; 
       Change.bill5 =   result1[1] ;
       Change.coin2 =   result1[2] ; 
    }else{       
       result1 = bills(money-5) ; 
       Change.bill10= result1[0]        ; 
       Change.bill5 = result1[1] +    1   ;
       Change.coin2 = result1[2]       ; 
    }
     return new Change() ; 
   }


  public static long[] bills (long money){

     long[] bills = new long[3] ; 
     long l10 = money%10 ; 
     long l5 = l10%5 ; 
     bills[0] = (money-l10)/10 ;
     if(l10%5==0){
        bills[1] =  l10/5 ;   
     }else if(((money%10)%5)%2==0){
       bills[1] = (l10-l5)/5 ; 
       bills[2] = l5/2 ; 
     }else{
        bills[1] = 0 ; 
        bills[2] = l10/2 ;
     }
    return bills ; 
  }


}
