class Solution {
    public void rotate(int[][] matrix) {
        int n= matrix.length;
        int m= matrix[0].length;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<m;j++){
                int temp= matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

        for(int i=0;i<n;i++){
            reverse(matrix[i]);
        }


    }
    public void reverse(int nums[]){
        int i=0;
        int j=nums.length-1;

        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }
}