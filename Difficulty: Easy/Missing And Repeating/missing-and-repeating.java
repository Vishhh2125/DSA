// GFG-style Function Template
class Solution {
    // Function to find two elements in array
    ArrayList<Integer> findTwoElement(int arr[]) {
        int n = arr.length;
        
        // Expected sum and sum of squares
        long expectedSum = (long) n * (n + 1) / 2;
        long expectedSqSum = (long) n * (n + 1) * (2L * n + 1) / 6;

        long actualSum = 0, actualSqSum = 0;
        
        for (int num : arr) {
            actualSum += num;
            actualSqSum += (long) num * num;
        }

        long diff = expectedSum - actualSum; // x - y
        long sqDiff = expectedSqSum - actualSqSum; // x^2 - y^2 = (x - y)(x + y)

        long sum = sqDiff / diff; // x + y

        long x = (diff + sum) / 2; // missing
        long y = x - diff;         // repeating

        ArrayList<Integer> result = new ArrayList<>();
        result.add((int) y); // repeating first
        result.add((int) x); // missing second
        return result;
    }
}
