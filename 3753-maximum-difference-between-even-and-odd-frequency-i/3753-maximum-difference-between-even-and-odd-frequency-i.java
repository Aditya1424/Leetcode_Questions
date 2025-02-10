class Solution {
    public int maxDifference(String s) {
       int freq[]= new int[26];

       for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
       }
        int c=Integer.MAX_VALUE,d=0;
       for(int i=0;i<freq.length;i++){
        if(freq[i]%2==0 && freq[i] >0){
            c= Math.min(c,freq[i]);
        }
        else if(freq[i]%2!=0){
            d= Math.max(d,freq[i]);
        }

       }

       return d-c;
    }
}