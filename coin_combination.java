public class coin_combination {
    public static void main(String[] args) {
        int coin[]={2,3,5};
        int amt=10;
        Combination(coin, amt,"",0);
    }
    public static void Combination(int coin[],int amt,String ans,int indx){
        if(amt==0){
            System.out.print(ans+" ");
            return;
        }
        for(int i=indx;i<coin.length;i++){
            if(amt>=coin[i]){
                Combination(coin, amt-coin[i], ans+coin[i], i);
            }
        }
    }
}
