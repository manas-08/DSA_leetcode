class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 1; i <= n * n; i++) {
            map.put(i, 0);
        }
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                int val = map.get(grid[r][c]) + 1;
                map.put(grid[r][c], val);
            }
        }
    int[] result = new int[2];
    for(Map.Entry<Integer, Integer> entry:map.entrySet())
    {
        if (entry.getValue() == 2) {
            result[0] = entry.getKey(); // Removed extra ')'
        }
        if (entry.getValue() == 0) {
            result[1] = entry.getKey(); // Removed extra ')'
        }
    }
    return result;
    }
}