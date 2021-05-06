
// To be improved time  


declare var Set: any;

function magic(stones: Array<number>): Array<number>  {

   let setArr = new Set(stones) ;
   if(setArr.size===stones.length)  
   {
     return stones; 
   
    }
   let returnedArry = [] ;  
   while(stones.length > 0){
       let stone = stones.pop()
       let indexOfElem = stones.indexOf(stone) 
       if(indexOfElem!== -1){
       	    stones.splice(indexOfElem,1) ; 
            returnedArry.push(stone+1)
       }else{
       	   returnedArry.push(stone) ; 
       }

    }                    
     return magic(returnedArry) ; 

   }

 

let arry = [1 , 2 , 4 , 2 , 7, 7, 3,1] ; 

 const val  = magic(arry)  ;

 console.log(val)
 