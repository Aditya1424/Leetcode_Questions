class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> ll= new ArrayList<>();

        // TC--> O(n*m)
        // SC--> O(n*m)
        int minr= 0;
        int minc=0;
        int maxr= matrix.length-1;
        int maxc= matrix[0].length-1;

        int c=0;
        int te= matrix.length*matrix[0].length;
        
        while(c<te){

        
        // right
        for(int i=minc;i<=maxc && c<te;i++){
            ll.add(matrix[minr][i]);
            c++;
        }
        minr++;

        // bottom
        for(int i=minr;i<=maxr && c<te;i++){
            ll.add(matrix[i][maxc]);
            c++;
        }
        maxc--;

        // left
        for(int i=maxc;i>=minc && c<te;i--){
            ll.add(matrix[maxr][i]);
            c++;
        }
        maxr--;

        // top
        for(int i=maxr;i>=minr && c<te;i--){
            ll.add(matrix[i][minc]);
            c++;
        }
        minc++;
        }
        return ll;
    }
}