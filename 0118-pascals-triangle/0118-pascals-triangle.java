class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res= new ArrayList<>();

        for(int i=1;i<=numRows;i++){
            res.add(generateRows(i));
        }
        return res;
    }

    public static ArrayList<Integer> generateRows(int rows){
        ArrayList<Integer> ll= new ArrayList<>();
        int ans=1;
        ll.add(1);
        for(int i=1;i<rows;i++){
            ans= ans*(rows-i);
            ans/=i;
            ll.add(ans);
        }
        return ll;
    }
}