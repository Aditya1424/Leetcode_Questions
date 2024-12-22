class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        int ans[] = new int[2];

        
        
        for(int i=0;i<k;i++){
            ans= min(nums);
            nums[ans[0]]= ans[1]*multiplier;
        }

        return nums;
        
    }

    public static int[] min(int arr[]){
        int min= arr[0];
        int idx=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min= arr[i];
                idx=i;
            }
        }
        return new int[] {idx,min};
    }
}