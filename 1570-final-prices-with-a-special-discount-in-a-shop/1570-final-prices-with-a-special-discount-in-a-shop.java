class Solution {
    public int[] finalPrices(int[] arr) {
        
        int n= arr.length;
        int ans[]= new int[n];

        Stack<Integer> st= new Stack<>();

        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[i]<=arr[st.peek()]){
                int idx= st.peek();
                ans[idx]= arr[idx]-arr[i];
                st.pop();
            }

            st.push(i);
        }


        while(!st.isEmpty()){
            int idx= st.peek();
            ans[idx]= arr[st.peek()];
            st.pop();
        }

        return ans;
    }
}