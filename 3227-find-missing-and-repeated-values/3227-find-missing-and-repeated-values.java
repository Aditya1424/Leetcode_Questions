class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        
        int n= grid.length;
        int size= n*n;
        

        int c[]= new int[size+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                c[grid[i][j]]++;
            }
        }

        int a=-1;
        int b=-1;
        for(int i=1;i<=size;i++){
            if(c[i]==2){
                a= i;
            }
            else if(c[i]==0){
                b= i;
            }
        }

        return new int[]{a,b};
    }
}