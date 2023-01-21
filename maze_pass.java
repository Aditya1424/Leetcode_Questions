public class maze_pass {
    public static void main(String[] args) {
        int n=3;
        int m=4;
        Answer(n, m,"");
    }
    public static void Answer(int n,int m,int cc, int cr,String ans){
        if(cc==m-1 && cr==n-1){
            System.out.println(ans);
            return;
        }
        if(cc>=m || cr>=n){
            return;
        }
        Answer(n, m, cc, cr+1, ans+"V");
        Answer(n, m, cc+1, cr, ans+"H");
    }
}
