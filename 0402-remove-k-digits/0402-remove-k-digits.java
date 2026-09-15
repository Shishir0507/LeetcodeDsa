
class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < num.length(); i++) {
            while (!s.isEmpty() && k > 0 && s.peek() > num.charAt(i)) {
                s.pop();
                k--;
            }
            s.push(num.charAt(i));
        }
        while (k > 0) {
            s.pop();
            k--;
        }
        StringBuilder ans = new StringBuilder();

        while (!s.isEmpty()) {
            ans.append(s.pop());
        }
        ans.reverse();
        int i = 0;
        while (i < ans.length() && ans.charAt(i) == '0') {
            i++;
        }

        ans = new StringBuilder(ans.substring(i));
        if (ans.length() == 0) {
            return "0";
        }
        return ans.toString();
    }
}