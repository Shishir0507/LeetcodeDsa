class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
       int arr[]=new int[nums1.length];
       int k=0;
       for(int i =0;i<nums1.length;i++){
        int ele=nums1[i];
          boolean f=false;
          boolean found=false;
        for(int j =0;j<nums2.length;j++){
            if(nums2[j]==ele){
                f=true;
            }
            else if(f){
                if(nums2[j]>ele){
                    arr[k++]=nums2[j];
                    found=true;
                    break;
                }
            }
             if(j==nums2.length-1 && !found){
                arr[k++]=-1;
            }
        }
       }
       return arr;
    }
}