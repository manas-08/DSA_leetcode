class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int alterEleCount = 1, ans = 0, n = colors.length;
        for (int i = 1; i <= colors.length + k - 2; i++) {
            if (colors[i % n] != colors[(i - 1 + n) % n]) {
                alterEleCount++;
            } else {
                alterEleCount = 1;
            }
            if (alterEleCount >= k) {
                ans++;
            }
        }
        return ans;
    }
}