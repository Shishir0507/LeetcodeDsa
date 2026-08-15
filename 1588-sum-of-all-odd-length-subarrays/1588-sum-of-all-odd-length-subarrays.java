class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            int left = i + 1;
            int right = n - i;

            int totalSubarrays = left * right;
            int evenLength = totalSubarrays / 2;
            int oddLength = totalSubarrays - evenLength;

            ans += arr[i] * oddLength;
        }

        return ans;
    }
}