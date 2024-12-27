class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int ans= 0;
        int max= values[0];
        for(int i=1;i<values.length;i++){
            if(values[i]-i+max>ans){
                ans = values[i]-i+max;
            }

            if(values[i]+i>max){
                max= values[i]+i;
            }
        }
        return ans;
    }
}