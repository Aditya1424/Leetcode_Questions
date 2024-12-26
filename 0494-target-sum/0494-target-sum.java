class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return helper(nums, target, 0, 0);
    }

    public static int helper(int[] arr, int target, int idx, int sum) {
        if (idx >= arr.length)
            return sum == target ? 1 : 0;
        
        int add = helper(arr, target, idx + 1, sum + arr[idx]);
        int subtract = helper(arr, target, idx + 1, sum - arr[idx]);
        

        return subtract + add;
    }
}