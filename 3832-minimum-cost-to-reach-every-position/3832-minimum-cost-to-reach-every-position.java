class Solution {
    public int[] minCosts(int[] cost) {
        int max= cost[0];
        for(int i=1;i<cost.length;i++){
            if(cost[i]>max){
                cost[i]=max;
            }
            else{
                max= cost[i];
            }
        }
        return cost;
    }
}