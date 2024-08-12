class Solution {
public:

    int solve(vector<int> &nums, int i, vector<int>& dp){
        // base case
        if(i>=nums.size()){
            return 0;
        }

        if(dp[i]!=-1){
            return dp[i];
        }

        int incl= solve(nums,i+2,dp)+nums[i];
        int excl= solve(nums,i+1,dp);

        dp[i]= max(incl,excl);

        return dp[i];

    }
    int rob(vector<int>& nums) {
        vector<int> dp(nums.size()+1 ,-1);
        int ans = solve(nums, 0,dp);
        return ans;
    }
};