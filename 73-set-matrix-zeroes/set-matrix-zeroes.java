class Solution {
    public void setZeroes(int[][] arr) {


    // the row== arr[..][0]
    //the column== arr[0][...]

     boolean col=true;
     boolean row=true;

    for(int i=0;i<arr.length;i++){
        for(int j =0;j<arr[0].length;j++){

            if(arr[i][j]==0){

                if(i==0){
                    //column have to be zero 
                    row=false;
                }
                 if(j==0){
                    col=false;
                }else{

                arr[i][0]=0;
                arr[0][j]=0;
                }

                
                
            }


        }
    }

    for(int i=1;i<arr.length;i++){
        for(int j=1;j<arr[0].length;j++){

            if(arr[0][j]==0 || arr[i][0]==0){
                arr[i][j]=0;
            }

           



        }
    }

     if(col==false){
        //zero whole column by keeping j==0
                for(int i=0;i<arr.length;i++){
                      arr[i][0]=0;

                }
            }
       

       if(row==false){
        //zero whole column by keeping i==0
                for(int i=0;i<arr[0].length;i++){
                      arr[0][i]=0;

                }
            }


        
    }
}