public class gas_station {
    public static void main(String[] args) {
        int [] cost = {3,4,5,1,2};
        int [] gas = {1,2,3,4,5};
        System.out.println(CompleteCirciut(gas,cost));
    }
    public static int CompleteCirciut(int[] gas,int[] cost){
        int tc =0;
        int curr=0;
        int sum=0;
        for(int i=0;i<cost.length;i++){
        tc = tc+gas[i]-cost[i];
        curr+=gas[i]-cost[i];
        if(curr<0){
            curr=0;
            sum=i+1;
        }
        }
        if(tc<0){
            return -1;

    }
    return sum;
}

}
