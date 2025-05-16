class Solution {
    public List<String> getWordsInLongestSubsequence(String[] words, int[] groups) {
        int m = groups.length;
        int[] arr = new int[m];
        int[] pre = new int[m];
        Arrays.fill(arr, 1);
        Arrays.fill(pre, -1);
        int maxIdx = 0;
        for(int i = 1; i < m; i++){
            for(int j = 0; j < i; j++){
                if(checkingStrings(words[i], words[j]) && arr[j] + 1 > arr[i] && groups[i] != groups[j]){
                    arr[i] = arr[j] + 1;
                    pre[i] = j;
                } 
            }
            if(arr[i] > arr[maxIdx]) maxIdx = i;
        }
        List<String> ans = new ArrayList<>();
        for (int i = maxIdx; i >= 0; i = pre[i]) {
            ans.add(words[i]);
        }
        Collections.reverse(ans);
        return ans;
    }

    private boolean checkingStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        int dif = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (++dif > 1) {
                    return false;
                }
            }
        }
        return dif == 1;
    }
}