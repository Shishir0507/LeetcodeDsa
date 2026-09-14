class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> s = new Stack<>();
        for (int asteroid : asteroids) {
            if (asteroid > 0) {
                s.push(asteroid);
            } else {
                boolean destroyed = false;
                while (!s.isEmpty() && s.peek() > 0) {
                    if (s.peek() < Math.abs(asteroid)) {
                        s.pop();
                    } else if (s.peek() == Math.abs(asteroid)) {

                        s.pop();
                        destroyed = true;
                        break;
                    } else {
                        destroyed = true;
                        break;
                    }
                }

                if (!destroyed) {
                    s.push(asteroid);
                }
            }
        }
        int[] ans = new int[s.size()];
        for (int i = 0; i < s.size(); i++) {
            ans[i] = s.get(i);
        }
        return ans;
    }
}