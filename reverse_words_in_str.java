public class reverse_words_in_str {
    public static void main(String[] args) {
        String s = " the sky is blue ";
        System.out.println(reverseWords1(s));
    }
    public static String reverseWords1(String s){
        s=s.trim();
        String []arr = s.split("\s+");
        String ans="";
        for(int i=arr.length-1;i>=0;i--){
            ans=ans+arr[i]+" ";
        }
        return ans.trim();
    }
}
