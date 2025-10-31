class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int c=m+n-1;

         int i=m-1; //indexing 
         int j =n-1;//indeing from last 
        while(i>=0 && j>=0){

            if(nums1[i]>=nums2[j]){
                nums1[c]=nums1[i];
                c--;
                i--;

            }else{
                nums1[c]=nums2[j];
                j--;
                c--;


            }
        }


        while(i>=0){
            nums1[c]=nums1[i];
                c--;
                i--;
            
        }

        while(j>=0){
              nums1[c]=nums2[j];
                j--;
                c--;

        }
        
    }
}