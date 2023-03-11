class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        List<Integer> ll = new ArrayList<>();
        int minr=0;
        int minc=0;
        int maxr= arr.length-1;
        int maxc = arr[0].length-1;
        int te = arr.length*arr[0].length;
        int c=0;
        while(c<te){

        for(int i=minc;i<=maxc && c<te;i++){
            ll.add(arr[minr][i]);
            c++;
        }
        minr++;
        
        for(int i=minr;i<=maxr && c<te;i++){
            ll.add(arr[i][maxc]);
            c++;
        }
        maxc--;

        for(int i=maxc;i>=minc && c<te;i--){
            ll.add(arr[maxr][i]);
            c++;
        }
        maxr--;

        for(int i=maxr;i>=minr && c<te;i--){
            ll.add(arr[i][minc]);
            c++;
        }
        minc++;
        }
        return ll;
    }
}
