class Solution {
    public int totalFruit(int[] fruits) {
       HashMap <Integer,Integer> map = new HashMap<>();
        int l=0,r=0,max=0;
        while(r<fruits.length){
            map.put(fruits[r],map.getOrDefault(fruits[r],0)+1);
           while(map.size()>2){
           int fruit = fruits[l];

                map.put(fruit, map.get(fruit) - 1);

                if (map.get(fruit) == 0) {
                    map.remove(fruit);
                }

                l++;
           }
           max=Math.max(max,r-l+1);
           r++;
        }
       
       return max;
    }
}