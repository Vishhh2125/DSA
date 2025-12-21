class Solution {
    public int[] asteroidCollision(int[] arr) {


        Deque<Integer> st = new ArrayDeque<>();
         ArrayList<Integer> negative_asteroid= new ArrayList<>();

        for(int i=0;i<arr.length;i++){

            if(arr[i]>0){

                st.push(arr[i]);

            }else{

                while(!st.isEmpty()  && st.peek()<Math.abs(arr[i])){
                    st.pop();
                }

                if(st.isEmpty())  negative_asteroid.add(arr[i]);//survided negative astriod 
                else if(st.peek()==Math.abs(arr[i])){
                    //destory both 
                    st.pop();
                }
                


                
            }
        }
        

         int len= st.size()+negative_asteroid.size();

        int [] ans = new int [len];



        int i=0;


        while(negative_asteroid.size()!=0){

            ans[i]=negative_asteroid.remove(0);
            i++;
        }

        while(!st.isEmpty()){
            ans[i]=st.removeLast();
            i++;
        }


        return ans ;
        
    }
}