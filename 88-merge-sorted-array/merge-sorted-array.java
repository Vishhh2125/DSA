class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i =m-1;
        int j =n-1;
        int current=n+m-1;


        while(i>=0 && j>=0){
          

            if(nums1[i]>nums2[j]){
                nums1[current]=nums1[i];
                i--;
                current--;
            }else if(nums1[i]<=nums2[j]){
             nums1[current]=nums2[j];
             j--;
             current--;


            }

          
        }

        if(i<0){
            //copy all form j wala array 

            for(int k =current;k>=0;k--){
                nums1[k]=nums2[j];
                j--;
            }
        }
        // else if(j<0){
        //     for(int m=current;)

        // }


        
        
    }
}