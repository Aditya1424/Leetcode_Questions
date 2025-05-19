class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ansRow= new ArrayList<>();

        for(int i=1;i<=numRows;i++){
            ansRow.add(generateRows(i));
        }

        return ansRow;
    }

    public static List<Integer> generateRows(int rows){
        List<Integer> row= new ArrayList<>();

        int ans=1;
        row.add(1);
        for(int i=1;i<rows;i++){
            ans= ans*(rows-i);
            ans=ans/i;
            row.add(ans);
        }
        return row;
    }
}