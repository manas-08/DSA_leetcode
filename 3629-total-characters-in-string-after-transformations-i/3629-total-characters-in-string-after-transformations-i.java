class Solution {
    public static final int mod = 1000000007;
    public int lengthAfterTransformations(String s, int t) {
        int[] count = new int[26];
        for (char ch : s.toCharArray()) {    // frequency array
            ++count[ch - 'a'];    
        }
        for (int i = 0; i < t; ++i) {
            int[] nxt = new int[26];
            nxt[0] = count[25];
            nxt[1] = (count[25] + count[0]) % mod;
            for (int j = 2; j < 26; ++j) {
                nxt[j]  = count[j - 1];
            }
            count = nxt;
        }
        int res = 0;
        for (int i = 0; i < 26; ++i) {
            res = (res + count[i]) % mod;
        }
        return res;
    }
}