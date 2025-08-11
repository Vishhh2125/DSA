import java.util.*;
import java.util.AbstractMap.SimpleEntry;


class Solution {
    public int[] frequencySort(int[] arr ) {
         

         HashMap <Integer,Integer>  map = new HashMap<>();

        for(int i=0;i<arr.length;i++){

            map.put(arr[i],map.getOrDefault(arr[i],0)+1);



        }

        PriorityQueue<SimpleEntry <Integer,Integer> > minheap = new PriorityQueue<>(
            (a,b)->{
                if(a.getValue()-b.getValue()==0){
                    return Integer.compare(b.getKey(),a.getKey()) ;
                }else{
                    return Integer.compare(a.getValue(),b.getValue());
                }
            }
        );
       


       Set<Integer> key = map.keySet();

        for(Integer num:key){
            minheap.add(new SimpleEntry<>(num,map.get(num)));


            
        }


        int [] ans= new int[arr.length];


       int i=0;


       while(!minheap.isEmpty()){
        int freq= minheap.peek().getValue();
        int val=minheap.peek().getKey();
          
        for(int k=0;k<freq;k++){

            ans[i++]=val;

        }

        minheap.poll();
       }
      

      return ans;



        
        
    }
}