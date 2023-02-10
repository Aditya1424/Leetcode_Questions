class Solution {
    public int missingNumber(int[] nums) {

        // My first bad approch

        // Arrays.sort(nums);
        // int res=nums[nums.length-1]+1;
        
        // for(int i=0;i<nums.length-1;i++){
        //     if(nums[i+1]-nums[i]!=1){
        //         return (nums[i]+nums[i+1])/2;
        //     }
        // }
        // if(nums[0]==1){
        //     return 0;
        // }
    
        // return res;


    // O(n) complexity 

        int n = nums.length;
        int sum = n*(n+1)/2;
        for(int i=0;i<nums.length;i++){
            sum = sum-nums[i];
        }
        return sum;
    }
        
}
