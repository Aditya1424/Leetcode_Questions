class Solution {
public:

    int solve(vector<int>& nums, int i, vector<int>& dp){
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
        vector<int> dp1(nums.size()+1,-1);
       vector<int> dp2(nums.size()+1,-1);

        vector<int> v1,v2;
        
        if(nums.size()==1)
            return nums[0];

        for(int i=0;i<nums.size();i++){
            if(i!=0){
                v1.push_back(nums[i]);
            }
            if(i!=nums.size()-1){
                v2.push_back(nums[i]);
            }

           
        }
         return max(solve(v1,0,dp1),solve(v2,0,dp2));

    }
};