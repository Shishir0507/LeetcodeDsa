class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st=new Stack<>();
        int n1=nums1.length;
        int n2=nums2.length;

        int ans[]= new int[n2];
        ans[n2-1]=-1;
        st.push(nums2[n2-1]);
        for(int i=n2-2;i>=0;i--)
        {
            int curr=nums2[i];
            while(!st.isEmpty() && st.peek()<=curr){
                st.pop();
            }
            if(st.isEmpty()) ans[i]=-1;
            else ans[i]=st.peek();
            st.push(curr);
        }

        HashMap<Integer,Integer> map= new HashMap<>();

        for(int i=0;i<n2;i++)
        {
            map.put(nums2[i],i);
        }

        int res[]=new int[n1];
        for(int i=0;i<n1;i++)
        {
            int ele=nums1[i];
            int idx=map.get(ele);
            res[i]=ans[idx];
        }

        return res;
    }
}