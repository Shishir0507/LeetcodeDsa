class Solution {
    public int minRotations(String s) {
        int ans = 0;

        int current = 0;

        for (int i = 0; i < s.length(); i++) {
            int next = s.charAt(i) - '0';

            int d = Math.abs(current - next);

            ans += Math.min(d, 10 - d);

            current = next;
        }

        return ans;
    }
}