class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        
        int max =0;
        
        int n =arr.length;
        ArrayList<Integer> ans=new ArrayList<>();
        
        
        for(int i =n-1;i>=0;i--){
            
            if(arr[i]>=max){
                ans.add(arr[i]);
                
                max=arr[i];
            }
        }
        
        //reverse the ans 
        
        int m=ans.size();
        for(int i =0;i<m/2;i++){
            
            int temp =ans.get(m-i-1);
              ans.set(m-i-1,ans.get(i));
              ans.set(i,temp);
        }
        return ans;
        
    }
}
