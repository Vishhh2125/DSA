class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {

        HashMap<Integer,Integer> map = new HashMap<>();


        int m =nums1.length;
        int n=nums2.length;

        for(int i=0;i<nums1.length;i++){
            
            map.put(nums1[i],map.getOrDefault(nums1[i],0)+n);
        }

         for(int i=0;i<nums2.length;i++){
            
            map.put(nums2[i],map.getOrDefault(nums2[i],0)+m);
        }

          int result =0;

        for(int num :map.keySet()){

        int count =map.get(num);

        if(count%2==1){
            result^=num;
        }

        }

        return result;
        
    }
}