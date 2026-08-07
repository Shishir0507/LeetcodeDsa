class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int s=0;
        int e=matrix.length*matrix[0].length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            int n =mid/matrix[0].length;
            int m= mid%matrix[0].length;
            if(matrix[n][m]==target){
                return true;
            }
            else if(matrix[n][m]<target){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return false;
    }
}