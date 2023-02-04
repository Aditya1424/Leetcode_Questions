public class coin_permutation {
    public static void main(String[] args) {
        int coin[]={2,3,5};
        int amt=10;
        Permutation(coin, amt,"");
    }
    public static void Permutation(int []coin,int amt,String ans){
        if(amt==0){
            System.out.print(ans+" ");
            return;
        }
        for(int i=0;i<coin.length;i++){
            if(amt>=coin[i]){
                Permutation(coin, amt-coin[i], ans+coin[i]);
            }
            
        }
    }
}
