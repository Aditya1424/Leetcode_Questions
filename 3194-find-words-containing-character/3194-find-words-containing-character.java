class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> ll= new ArrayList<>();

        for(int i=0;i<words.length;i++){
            if(words[i].indexOf(x)!= -1){
                ll.add(i);
            }
        }
        return ll;
    }
}