class Solution {
    public List<List<Integer>> generate(int numRows) {
        if (numRows == 0) return new ArrayList<>();
        if (numRows == 1) {
            List<List<Integer>> ans= new ArrayList<>();
            ans.add(Arrays.asList(1));
            return ans;
        }
        
        List<List<Integer>> preRows = generate(numRows - 1);
        List<Integer> newR = new ArrayList<>();
        
        for (int i = 0; i < numRows; i++) newR.add(1);
        
        for (int i = 1; i < numRows - 1; i++) {
            newR.set(i, preRows.get(numRows - 2).get(i - 1) + preRows.get(numRows - 2).get(i));
        }
        preRows.add(newR);
        return preRows;
    }
}