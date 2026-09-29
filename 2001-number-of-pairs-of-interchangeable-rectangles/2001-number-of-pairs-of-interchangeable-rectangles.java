class Solution {
    public long interchangeableRectangles(int[][] rectangles) {

        HashMap<Double, Integer> map = new HashMap<>();

        for (int i = 0; i < rectangles.length; i++) {

            double ratio = (double) rectangles[i][0] / rectangles[i][1];

            map.put(ratio, map.getOrDefault(ratio, 0) + 1);
        }
            long ans =0;
        for (Map.Entry<Double, Integer> en : map.entrySet()) {

            int f = en.getValue();

            if (f >= 2) {
               ans+=(long) f*(f-1)/2;
            }
        }

        return ans;
    }
}