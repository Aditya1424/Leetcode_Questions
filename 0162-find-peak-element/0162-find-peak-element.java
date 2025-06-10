class Solution {
    public int findPeakElement(int[] nums) {
        // O(n)--> naive approach
        // int n= nums.length;
        // if(n==1)return 0;
        // for(int i=0;i<n;i++){
        //     if((i==0 || nums[i]>nums[i-1]) && (i==n-1 || nums[i]>nums[i+1])){
        //         return i;
        //     }
        // }
        // return -1;

        // O(log(n))--> optimal approach

        int n= nums.length;
        if(n==1)return 0;
        if(nums[0]>nums[1])return 0;
        if(nums[n-1]>nums[n-2])return n-1;

        int low=1;
        int high=n-2;
        while(low<=high){
            int mid= low+(high-low)/2;

            if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1])return mid;

            if(nums[mid]>nums[mid-1]){
                low= mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }
}