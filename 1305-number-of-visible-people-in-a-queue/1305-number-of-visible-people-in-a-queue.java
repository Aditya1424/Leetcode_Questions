class Solution {
    public int[] canSeePersonsCount(int[] arr) {
        Stack<Integer> st= new Stack<>();

        int ans[]= new int[arr.length];

        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[i]>=arr[st.peek()]){
                ans[st.pop()]++;
            }

            if(!st.isEmpty()){
                ans[st.peek()]++;
            }
            st.push(i);
        }

        return ans;
    }
}