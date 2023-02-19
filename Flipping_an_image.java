class Solution {
    public int[][] flipAndInvertImage(int[][] arr) {
        int arr2[][] = new int[arr.length][arr.length];
        int c=0;
        for(int i=0;i<arr.length;i++){
	        for(int j=arr.length-1;j>=0;j--){
	            arr2[i][c] = arr[i][j];
                c++;
	            
	            
	        }
            c=0;
        }
        for(int i=0;i<arr.length;i++){
	        for(int j=0;j<arr[0].length;j++){
                if(arr2[i][j]==0)
                arr2[i][j]=1;
                else
                arr2[i][j]=0;
            }
        }
        return arr2;
    }
}
