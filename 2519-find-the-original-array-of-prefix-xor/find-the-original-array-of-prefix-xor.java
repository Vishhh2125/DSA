class Solution {
    public int[] findArray(int[] pref) {
        
        int [] ans = new int[pref.length];


        int prefix=0;
        
         ans[0]=pref[0];
         prefix=pref[0];
        for(int i=1;i<pref.length;i++){
            ans[i]=pref[i]^prefix;
            prefix^=ans[i];
        }

        return ans;
    }
}