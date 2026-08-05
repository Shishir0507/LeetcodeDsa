class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if((long)m*k>bloomDay.length){
            return -1;
        }
   
    int min=Integer.MAX_VALUE ;
         int max=Integer.MIN_VALUE;
         for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]<min){
                min=bloomDay[i];
            }
            if(bloomDay[i]>max){
                max=bloomDay[i];
            }
         }
         while(min<=max){
            int mid= min+(max-min)/2;
            if(possible(bloomDay,mid,m,k)==true){
               max=mid-1;
            }
            else{ min=mid+1;}
         }
         return min;
    }
    public boolean possible(int arr[],int days,int m,int k){
        int count=0;
        int noOfbloom=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=days){
                count++;
            }else{
                noOfbloom+=(count/k);
                count=0;

            }
        }
        noOfbloom+=(count/k);
        if(noOfbloom>=m)
        {
            return true;
        }
 return false;
    }
   
}