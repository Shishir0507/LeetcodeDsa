class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {

        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();

        int left1 = 0;
        int left2 = 0;
        int ans = 0;

        for (int right = 0; right < nums.length; right++) {

            map1.put(nums[right], map1.getOrDefault(nums[right], 0) + 1);
            map2.put(nums[right], map2.getOrDefault(nums[right], 0) + 1);

            while (map1.size() > k) {
                int x = nums[left1];

                map1.put(x, map1.get(x) - 1);

                if (map1.get(x) == 0) {
                    map1.remove(x);
                }

                left1++;
            }

            while (map2.size() >= k) {
                int x = nums[left2];

                map2.put(x, map2.get(x) - 1);

                if (map2.get(x) == 0) {
                    map2.remove(x);
                }

                left2++;
            }

            ans += left2 - left1;
        }

        return ans;
    }
}