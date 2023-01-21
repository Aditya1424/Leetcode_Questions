public class leetcode_76 {
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println(MinimumWindow(s, t));
    }
    public static String MinimumWindow(String s,String t){
        int [] freq = new int[123];
        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
            freq[ch]++;
        }
        int freqs[] = new int[123];
        int si=0;
        int ei=0;
        int start =-1;
        int len =0;
        int count =0;
        while(ei<s.length()){
            // grow
            char ch = s.charAt(ei);
            freqs[ch]++;
            if(freq[ch]>=freqs[ch]){
                count++;
            }
            // shrink
            if(count ==t.length()){
                
                while(freqs[s.charAt(si)]>freq[s.charAt(si)]){
                    freqs[s.charAt(si)]--;
                    si++;
                }
            }
            // ans
            if(len>(ei-si+1)){
                len=ei-si+1;
                start=si;
            }


            ei++;
        } 
        if(start==-1){
            return "";
        }
        return s.substring(start, start+len);
    }
}
