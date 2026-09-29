class Solution {
    public int countDistinctIntegers(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
              int rev=0;
            while(nums[i]>0){
                int r =nums[i]%10;
                rev=rev*10+r;
                nums[i]/=10;
            }
            map.put(rev,map.getOrDefault(rev,0)+1);
        }
        int count=0;
        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            count++;
        }
        return count;
    }
}