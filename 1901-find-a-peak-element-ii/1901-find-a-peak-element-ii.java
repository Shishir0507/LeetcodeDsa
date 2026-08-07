class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int ans[]= new int[2];
        ans[0]=-1;
        ans[1]=-1;
        int s=0;
        int e=mat[0].length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
           int row=maxele(mat,mid);
            int left=mid-1>=0?mat[row][mid-1]:-1;
           int right=mid+1<mat[0].length?mat[row][mid+1]:-1;
            if(mat[row][mid]>left && mat[row][mid]>right){
                ans[0]=row;
                 ans[1]=mid;
                return ans;
            }
            if(left>mat[row][mid]){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        
        return ans;
    }
    public int maxele(int[][]m,int mid){
    int max=Integer.MIN_VALUE;
    int r=0;
    for(int i=0;i<m.length;i++){
        if(m[i][mid]>=max){
            max=m[i][mid];
            r=i;
        }
    }
    return r;
    }
}