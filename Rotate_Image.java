class Solution {
    public void rotate(int[][] matrix) {
        Rotate(matrix);
    }
    public static void Tranpose(int[][] arr){
            for(int i=0;i<arr.length;i++){
                for(int j=i+1;j<arr.length;j++){
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                    // System.out.print(arr+" ");
                }
                
            }
        }
        public static void Rotate(int [][]arr){
            Tranpose(arr);
            for(int i=0;i<arr.length;i++){
                reverse(arr[i]);
            }

        }
        public static void reverse(int []arr){
            int i=0;
            int j=arr.length-1;
            while(i<j){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                 i++;
                 j-- ;
            }
           
        }
}
