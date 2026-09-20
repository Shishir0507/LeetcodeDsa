class Solution {
    public int reverseDegree(String s) {
        int sum = 0;
        for (int i = 0; i <= s.length() - 1; i++) {
            sum += (i + 1) * ('z' - s.charAt(i)+1);
        }
        return sum;
    }
}