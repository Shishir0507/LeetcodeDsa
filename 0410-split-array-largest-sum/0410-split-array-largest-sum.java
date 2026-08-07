class Solution {
    public int splitArray(int[] nums, int k) {
        int s=Integer.MIN_VALUE;
        int e=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=s){
                s=nums[i];
            }
            e+=nums[i];
        }
        while(s<=e){
            int mid=s+(e-s)/2;
            int arr=reqArr(nums,mid);
            if(arr<=k){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return s;
    }
    public int reqArr(int nums[],int mid){
        int count=1;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]+sum>mid){
                sum=nums[i];
                count++;
            }
            else{
                sum+=nums[i];
            }
        }
        return count;
    }
}