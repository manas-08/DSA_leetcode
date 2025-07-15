class Solution {
    public boolean isValid(String word) {
        if (word.length() < 3) return false;
        int v = 0; // counter for vowels
        int c = 0;  // counter for consonants 
        char[] words = word.toCharArray();
        for(char ch: words){
            if(ch == 'a' || ch == 'i' || ch == 'e' || ch == 'o' || ch =='u' || ch == 'A' || ch == 'I' || ch == 'E' || ch == 'O' || ch == 'U'){
                v++;
            }
            else if ((ch <= 90 && ch >= 65) || (ch <= 122 && ch >= 97)) c++;
            else if (ch <= 57 && ch >= 48) continue;
            else return false;
        }
        if(v >= 1 && c >= 1) return true;

        return false;
    }
}