class Solution {
    public String pushDominoes(String dominoes) {
        String s = "L" + dominoes + "R";
        int n = s.length();
        char[] ans = s.toCharArray();
        int pre = 0;
        for (int i = 1; i < n; i++) {
            char c = s.charAt(i);
            if (c == '.') continue;
            if (i - pre > 1) {
                if (s.charAt(pre) == c) {
                    for (int k = pre + 1; k < i; k++) {
                        ans[k] = c;
                    }
                } else if (s.charAt(pre) == 'R' && c == 'L') {
                    int l = pre + 1, r = i - 1;
                    while (l < r) {
                        ans[l++] = 'R';
                        ans[r--] = 'L';
                    }
                }
            }
            pre = i;
        }
        return new String(ans, 1, n - 2);
    }
}