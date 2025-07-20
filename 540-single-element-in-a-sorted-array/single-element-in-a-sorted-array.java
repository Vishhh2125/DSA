class Solution {
    public int singleNonDuplicate(int[] arr) {

        //condition1:-we know that if teh index is even then the right side of that  index is similar 
        //condition2:-if the index is odd then left is the simlar elemnt 
        //if above both conditon do not follows means the left side is messed up the elemnt will be on left 
        //if  the above  conditon is true then the left is not ,essed and right one has that element 

       

        int n =arr.length;
         if(n==1)  return arr[0];
        int lo=0;
        int hi=n-1;
        //edge cases 
            // first is the ans 





        while(lo<=hi){

         int mid= lo+((hi-lo)/2);


         if(mid==0){

            //first edge case 

            if(arr[mid]!=arr[mid+1])  return arr[mid];
            else lo=mid+1;
         }

         if(mid==n-1){
            //last edge conditon 

            if(arr[mid-1]!=arr[mid])  return arr[mid];
            else hi=mid-1;
            
         }

        if(arr[mid]!=arr[mid-1] && arr[mid]!=arr[mid+1]){
            return arr[mid];
          
        }else if(mid%2==1){
            //it is odd 
            //check the left 

            if(arr[mid]==arr[mid-1]) {
                //this is true means move right 

                lo=mid+1;
            }else{
                hi=mid-1;
            }
         }else{

            //index is even check the right 

            if(arr[mid+1]==arr[mid]){
                lo=mid+1;
            }else{
                hi=mid-1;

            }
         }
            


            

        }

        return -1; //this conditon never comes

        
    }
}