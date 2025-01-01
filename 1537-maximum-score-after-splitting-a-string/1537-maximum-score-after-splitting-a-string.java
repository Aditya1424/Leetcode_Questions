class Solution {
    public int maxScore(String s) {
        int c=0,d=0;
        int res= Integer.MIN_VALUE;

        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)=='0'){
                c++;
            }
            else if(s.charAt(i)=='1'){
                d++;
            }
            res= Math.max(res,c-d);
        }

        if(s.charAt(s.length()-1)=='1'){
            d++;
        }

        return res+d;
    }
}