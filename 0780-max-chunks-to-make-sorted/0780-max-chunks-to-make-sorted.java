class Solution {
    public int maxChunksToSorted(int[] arr) {
        int max=0;
        int c=0;
        for(int i=0;i<arr.length;i++){
            max= Math.max(max,arr[i]);
            if(max==i){
                c++;
            }
        }
        return c;
    }
}