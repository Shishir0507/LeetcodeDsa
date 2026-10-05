class Solution {
    public int longestOnes(int[] nums, int k) {
        int l=0,r=0;
        int max=0;
       
        int z=0;
        while(r<nums.length){
            if(nums[r]==0){
                z++;
            }
            while(z>k){
                if(nums[l]==0){
                    z--;
                 
                }
                   l++;
            }
            max=Math.max(max,r-l+1);
            r++;
        }
        return max;
    }
}