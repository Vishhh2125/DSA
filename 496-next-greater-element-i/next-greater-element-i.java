class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {


        HashMap<Integer,Integer> map = new HashMap<>();
         

         Deque<Integer> st = new ArrayDeque<>();

        for(int i=nums2.length-1;i>=0;i--){

            int num =nums2[i];

              //here index= stack elemnt 
            while(!st.isEmpty() && num>nums2[st.peek()]){    //comapring from nums2[index] 
                st.pop();
            }


            if(st.isEmpty()){
                map.put(nums2[i],-1);
            }else{

                map.put(nums2[i],nums2[st.peek()]); 
            }

            st.push(i); //always put current index 

        }



        int [] ans = new int[nums1.length];
         int i=0;

        for(int num :nums1){

            int val= map.get(num);

            ans[i]=val;
            i++;
        }


        return ans ;
        
    }
}