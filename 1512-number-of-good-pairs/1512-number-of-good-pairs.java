class Solution {
    public int numIdenticalPairs(int[] nums) {
        int ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            int f =e.getValue();
            ans+=f*(f-1)/2;
        }
        return ans;
    }
}