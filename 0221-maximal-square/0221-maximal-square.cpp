class Solution {
public:

    int solve(vector<vector<char>>& mat, int i, int j,int &maxi){
        // base case
        if(i>=mat.size() || j>=mat[0].size()){
            return 0;
        }

        int r = solve(mat, i,j+1,maxi);
        int d = solve(mat, i+1, j+1,maxi);
        int b= solve(mat, i+1, j, maxi);

        if(mat[i][j]=='1'){
            int ans = 1+ min(r,min(d,b));
            maxi = max(maxi,ans);

            return ans;
        }

        else{
            return 0;
        }
    }

    int solveMem(vector<vector<char>>& mat, int i, int j,int &maxi, vector<vector<int>> &dp){
        // base case
        if(i>=mat.size() || j>=mat[0].size()){
            return 0;
        }

        if(dp[i][j]!=-1){
            return dp[i][j];
        }

        int r = solveMem(mat, i,j+1,maxi,dp);
        int d = solveMem(mat, i+1, j+1,maxi,dp);
        int b= solveMem(mat, i+1, j, maxi, dp);

        if(mat[i][j]=='1'){
            dp[i][j] = 1+ min(r,min(d,b));
            maxi = max(maxi,dp[i][j]);

            return dp[i][j];
        }

        else{
            return dp[i][j]= 0;
        }
    }

    int solveTab(vector<vector<char>>& mat, int &maxi){
        // base case analyze

        int row = mat.size();
        int col = mat[0].size();
        vector<vector<int>> dp(row+1, vector<int>(col+1,0));
        
        for(int i=row-1;i>=0;i--){
            for(int j=col-1;j>=0;j--){
                int r = dp[i][j+1];
                int d = dp[i+1][j+1];
                int b= dp[i+1][j];

                if(mat[i][j]=='1'){
                    dp[i][j] = 1+ min(r,min(d,b));
                    maxi = max(maxi,dp[i][j]);

                   
                }

                else{
                    dp[i][j]= 0;
                }
            }

            
        }
        return dp[0][0];
    }

    

    int maximalSquare(vector<vector<char>>& mat) {

        // int maxi =0;
        // solve(mat, 0,0, maxi);
        // return maxi*maxi;
        
        int n= mat.size();
        int m= mat[0].size();
        vector<vector<int>> dp(n,vector<int>(m,-1));
        int maxi=0;
        solveMem(mat, 0,0,maxi, dp);
        return maxi*maxi;
        
        // int maxi=0;
        // solveTab(mat, maxi);
        // return maxi*maxi;

    }
};