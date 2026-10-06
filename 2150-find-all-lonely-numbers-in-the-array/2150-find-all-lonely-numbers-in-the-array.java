class Solution {
    public List<Integer> findLonely(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> l = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for (Map.Entry<Integer, Integer> mp : map.entrySet()) {

            int number = mp.getKey();
            int frequency = mp.getValue();

            if (frequency == 1 &&
                !map.containsKey(number - 1) &&
                !map.containsKey(number + 1)) {

                l.add(number);
            }
        }

        return l;
    }
}