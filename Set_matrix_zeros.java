class Solution {
    public void setZeroes(int[][] arr) {
        int m= arr.length;
        int n = arr[0].length;
        boolean []row = new boolean[m];
        boolean []col = new boolean[n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==0){
                   row[i]=true;
                   col[j]=true;
                }
            }
        }
        for(int i=0;i<m;i++){
            if(row[i]){
                for(int j=0;j<n;j++){
                    arr[i][j]=0;
                }
            }
        }
        for(int j=0;j<n;j++){
            if(col[j]){
                for(int i=0;i<m;i++){
                    arr[i][j]=0;
                }
            }
        }
    }
}
