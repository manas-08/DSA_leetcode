class Solution {
    public int lengthOfLastWord(String s) {
        s = s.strip();   // if whitespaces and blankspaces are there
        if (s.length() == 1) return 1;
        int end = s.length() - 1;
        int len = 0;   // length of last word
        while(end >= 0 && s.charAt(end) != 32){       // we can compare two characters or strings, here we are comparing two characters, so take ascii value of space character
            len++;
            end--;       // end >= 0, otherwise out of bound error
        }
        return len;
    }
}