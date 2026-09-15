class Solution {
    public long subArrayRanges(int[] nums) {
      long sum=0;
      for(int i =0;i<nums.length;i++){
        int l =nums[i],s=nums[i];
        for(int j=i;j<nums.length;j++){
            l=Math.max(l,nums[j]);
            s=Math.min(s,nums[j]);
            sum+=(long)(l-s);
        }
  
      }  
            return sum;
    }
}