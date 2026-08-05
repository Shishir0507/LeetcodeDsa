class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
     int min=1;
     int max =Integer.MIN_VALUE;
    for(int i=0;i<nums.length;i++){
        
        if(nums[i]>=max){
            max=nums[i];
        }
    }
    int ans =0;
   while(min<=max){
    int mid=min+(max-min)/2;
        if(divisor(nums,mid)<=threshold){
            
                max=mid-1;
        }
        else{
         min=mid+1;
        }
    }
    return min;
    }
    public int divisor(int nums[],int d){
        int ans=0;
        for(int i=0;i<nums.length;i++){
            ans+=(nums[i]+d-1)/d;
        }
        return ans;
    }
}