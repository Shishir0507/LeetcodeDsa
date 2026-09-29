class Solution {
    public int minimumFlips(int n) {
      StringBuilder sb = new StringBuilder();
      while(n>0){
        if(n%2!=0){
            sb.append('1');
        }
        else{
            sb.append('0');
        }
        n/=2;
      }
int l=0;
int r=sb.length()-1;
int ans=0;
while(l<r){
    if(sb.charAt(l)!=sb.charAt(r)){
        ans+=2;
    }
    l++;
    r--;
}
return ans;
    }
}