class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int row=mat.length;
        int col=mat[0].length;
        Map<Integer,int[]> hash=new HashMap<>();
       
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                hash.put(mat[i][j],new int[]{i,j});
            }
        }
       
        int[] rowHash=new int[row];
        int[] colHash=new int[col];
       
        for(int i=0;i<arr.length;i++){
            int[] pop=hash.get(arr[i]);
            int x=pop[0];
            int y=pop[1];
            rowHash[x]++;
            colHash[y]++;
            if(rowHash[x]==col || colHash[y]==row){
                return i;
            }
        }
        return -1;


    }
}