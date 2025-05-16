class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String> ll= new ArrayList<>();
        ll.add(words[0]);     
        for(int i=1;i<groups.length;i++){
            if(groups[i]!=groups[i-1]){
                              
                ll.add(words[i]);
                
            }

        }

        
       
        return ll;
    }
}