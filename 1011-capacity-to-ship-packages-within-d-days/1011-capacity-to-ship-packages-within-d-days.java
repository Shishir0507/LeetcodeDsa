class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<weights.length;i++){
            sum+=weights[i];
            if(weights[i]>=max){
                max=weights[i];
            }
        }
        int s=max;
        int e=sum;
        while(s<=e){
            int mid=s+(e-s)/2;
            int reqDay=days(mid,weights);
            if(reqDay<=days){
                e=mid-1;
            }else{
                s=mid+1;
            }
        }
        return s;
    }
   public int days(int cap,int[]weights){
    int days=1;
    int load=0;
    
    for(int i=0;i<weights.length;i++){
        if(weights[i]+load>cap){
            days+=1;
            load=weights[i];
        }
        else{
            load+=weights[i];
        }

    }
    return days;
   } 
}