class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int sum=0;
            while(nums[i]!=0){
                int t =nums[i]%10;
                sum+=t;
                nums[i]/=10;
            }
            if(sum==i){
                return i;
            }
        }
        return -1;
    }
}