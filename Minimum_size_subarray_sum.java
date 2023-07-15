class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        return Length(target,nums);
    }
    public static int Length(int tar,int arr[]){
        int si=0;
        int ei=0;
        int sum=0;
        int ans=Integer.MAX_VALUE;
        while(ei<arr.length){
            sum+=arr[ei];
            

            while(sum>=tar && si<=ei){
                ans= Math.min(ans,ei-si+1);
                sum-=arr[si];
                si++;
            }
           
            ei++;
        }
        return ans==Integer.MAX_VALUE? 0: ans;
    }
}
