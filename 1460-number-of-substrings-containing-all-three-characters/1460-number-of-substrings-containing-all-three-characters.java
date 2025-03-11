class Solution {
    public int numberOfSubstrings(String s) {
        int left = 0, right = 0, total_subStrings = 0, len = s.length();
        int[] freqArr = new int[3];
        while (right < len) {
            char ch = s.charAt(right);
            freqArr[ch - 'a']++;

            while (allCharactersPresent(freqArr)) {
                total_subStrings += len - right;

                // decrement freq of ch at left ptr and incr the left ptr
                char leftChar = s.charAt(left); // shrinking the window_size
                freqArr[leftChar - 'a']--;
                left++;
            }
            right++;
        }
        return total_subStrings;
    }

    public boolean allCharactersPresent(int[] freq) {
        return freq[0] > 0 && freq[1] > 0 && freq[2] > 0; // to check if each character has atleast one occurence..
    }
}