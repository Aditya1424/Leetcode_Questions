class Solution {
    public int numJewelsInStones(String s, String s1) {
        int c=0;
        for(int i=0;i<s.length();i++){
            for(int j=0;j<s1.length();j++){
                if(s.charAt(i)==s1.charAt(j)){
                    c++;
                }
            }
        }
        return c;
    }
}
