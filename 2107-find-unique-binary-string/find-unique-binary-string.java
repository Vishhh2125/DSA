class Solution {
    public String findDifferentBinaryString(String[] nums) {

        Set<String> set = new HashSet<>();

        for(String st : nums){
            set.add(st);
        }

        int n = nums.length;

        for(int i = 0; i < (1 << n); i++){

            StringBuilder str = new StringBuilder(n);

            for(int j = n-1; j >= 0; j--){

                char bit = ((i & (1 << j)) == 0) ? '0' : '1';
                str.append(bit);

            }

            String s = str.toString();

            if(!set.contains(s))
                return s;
        }

        return "";
    }
}