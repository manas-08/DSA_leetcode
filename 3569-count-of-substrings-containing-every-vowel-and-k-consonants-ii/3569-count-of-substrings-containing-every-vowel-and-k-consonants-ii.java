class Solution {
    HashSet<Character> freqSet = new HashSet<>();
    public long countOfSubstrings(String s, int k) {
        freqSet.add('a');
        freqSet.add('e');
        freqSet.add('i');
        freqSet.add('o');
        freqSet.add('u');
        long atleast_k = getSubstrings(s, k);
        long atleast_kplus1 = getSubstrings(s, k + 1);
        return atleast_k - atleast_kplus1;
    }

    public long getSubstrings(String s, int k) {
        int i = 0;
        int j = 0;
        long ans = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int c = 0;
        while (i < s.length()) {
            char chAt_i = s.charAt(i);
            if (freqSet.contains(chAt_i)) {
                map.put(chAt_i, map.getOrDefault(chAt_i, 0) + 1);
            } else
                c++;
            while (map.size() == 5 && c >= k) {
                ans += (long) (s.length() - i);

                char chAt_j = s.charAt(j);
                if (freqSet.contains(chAt_j)) {
                    if (map.get(chAt_j) == 1)
                        map.remove(chAt_j);
                    else
                        map.put(chAt_j, map.get(chAt_j) - 1);
                } else
                    c--;
                j++;
            }
            i++;
        }
        return ans;
    }
}
