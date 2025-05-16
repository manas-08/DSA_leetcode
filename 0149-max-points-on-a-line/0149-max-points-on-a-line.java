class Solution {
    public int maxPoints(int[][] points) {
        int max = 1;
        for (int i = 0; i < points.length; i++) {
            HashMap<Double, Integer> hashMap = new HashMap<>();
            for (int j = 0; j < points.length; j++) {
                if (i == j) {
                    continue;
                }
                double slope_tan_theta = (points[j][0] - points[i][0]) != 0 ? (points[j][1] - points[i][1]) * 1.0 / (points[j][0] - points[i][0]) : Integer.MAX_VALUE;
                hashMap.put(slope_tan_theta, hashMap.getOrDefault(slope_tan_theta, 1) + 1);
                max = Math.max(max, hashMap.get(slope_tan_theta));
            }
        }
        return max;
    }
}