public class generate_parenthesis {
    public static void main(String[] args) {
        int n =3;
        Parenthesis(n, 0, 0, "");
    }
    public static void Parenthesis(int n,int open,int close,String ans) {
        if(open==n && close==n){
            System.out.print(ans+" ");
            return;
        }
        if(open<n){
            Parenthesis(n, open+1, close, ans+"(");
        }
        if(close<open){
            Parenthesis(n, open, close+1, ans+")");
        }
    }
}
