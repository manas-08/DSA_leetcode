class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> merge = new ArrayList<>();
        int[] previous = intervals[0];
        for (int i = 1; i < intervals.length; i++) {
            int[] interval = intervals[i];
            if (interval[0] <= previous[1]) {
                previous[1] = Math.max(previous[1], interval[1]);
            } else {
                merge.add(previous);
                previous = interval;
            }
        }
        merge.add(previous);

        return merge.toArray(new int[merge.size()][]);    
    }
}