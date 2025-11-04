class Solution {
    public int[][] merge(int[][] arr) {
        Arrays.sort(arr,(a,b)->a[0]-b[0]);
       ArrayList<int[]> ans = new ArrayList<>();
    int start =0;
     int end =1;

     int range_start=arr[0][start];
     int range_end=arr[0][end];


     for(int i =1;i<arr.length;i++){

        if(arr[i][start]<=range_end){

            //this sin connected range get teh end of max one 
            range_end=Math.max(arr[i][end],range_end);

        }
        else {

            ans.add(new int[]{range_start,range_end});

            range_start=arr[i][start];
            range_end=arr[i][end];


        }

     }

      ans.add(new int[]{range_start,range_end});


       int [] [] result  =new int[ans.size()][2];
       int i =0;
       for(int [] range :ans){
         result [i]=range;
         i++;
        

       }

       return result;


    }
}