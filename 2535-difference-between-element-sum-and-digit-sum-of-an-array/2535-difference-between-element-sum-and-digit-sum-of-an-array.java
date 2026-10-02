class Solution {
    public int differenceOfSum(int[] nums) {
        int esum=0;
        int dsum=0;
        for(int i=0;i<nums.length;i++){
            esum+=nums[i];
            while(nums[i]>0){
                int d = nums[i]%10;
                dsum+=d;
                nums[i]/=10;
            }
        }
        return(int) Math.abs(esum-dsum);
    }
}