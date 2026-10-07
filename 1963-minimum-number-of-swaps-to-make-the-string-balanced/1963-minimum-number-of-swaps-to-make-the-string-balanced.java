class Solution {
    public int minSwaps(String s) {
      int sw=0;
      int op=0;
      for(int i =0;i<s.length();i++){
        if(s.charAt(i)=='['){
            op++;
        }
        else{
            if(op==0){
                sw++;
                op++;
            }
            else{
                op--;
            }
        }
      }  
      return sw;
    }
}