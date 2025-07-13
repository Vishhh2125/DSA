class Solution {
    public List<Integer> majorityElement(int[] arr) {

        Integer major1 = null, major2 = null;
        int count1 = 0, count2 = 0;

        for (int i = 0; i < arr.length; i++) {
            if (major1 != null && arr[i] == major1) {
                count1++;
            } else if (major2 != null && arr[i] == major2) {
                count2++;
            } else if (count1 == 0) {
                major1 = arr[i];
                count1 = 1;
            } else if (count2 == 0) {
                major2 = arr[i];
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        int freq1 = 0, freq2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == major1) freq1++;
            else if (arr[i] == major2) freq2++;
        }

        List<Integer> ans = new ArrayList<>();


        if (freq1 > arr.length /3) ans.add(major1);
        if (freq2 > arr.length /3) ans.add(major2);

        return ans;
    }
}
