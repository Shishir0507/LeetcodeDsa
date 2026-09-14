class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int arr[]= new int [nums.length];
        for(int i=0;i<nums.length;i++){
            boolean a=false;
            int count=nums.length-1;
            int j=0;
            if(i<nums.length-2){
            j=i+1;}
            else{
                j=(i+1)%nums.length;
            }
            while(count-->0 ){
                if(nums[i]<nums[j]){
                    arr[i]=nums[j];
                     a=true;
                    break;
                   
                }
                j=(j+1)%nums.length;
            }
            if(!a){
                arr[i]=-1;
            }
        }
        return arr;
    }
}