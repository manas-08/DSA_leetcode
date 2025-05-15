class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int maxLen = 0;
        HashSet<Character> charset = new HashSet<>();

        for (int r = 0; r < s.length(); r++) {
            while (charset.contains(s.charAt(r))) {
                charset.remove(s.charAt(l));
                l++;
            }

            charset.add(s.charAt(r));
            maxLen = Math.max(maxLen, r - l + 1);
        }

        return maxLen;    
    }
}