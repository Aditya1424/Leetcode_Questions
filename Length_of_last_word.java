class Solution {
    public int lengthOfLastWord(String s) {
       s = s.trim();
       String []arr = s.split("\s+");
       String res = arr[arr.length-1];
       return res.length();
    }
    
}
