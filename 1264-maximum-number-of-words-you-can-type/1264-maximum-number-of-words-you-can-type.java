class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] words = text.split(" ");  // split about space.
        int ct =0;
        int len = words.length;
        if(brokenLetters.length() == 0) return len;
        for (int i = 0; i < len; i++){
            for(int j = 0; j < brokenLetters.length(); j++){
                if(words[i].contains(String.valueOf(brokenLetters.charAt(j)))) break;
                else if(!(words[i].contains(String.valueOf(brokenLetters.charAt(j)))) && (j == brokenLetters.length()-1))    ct++;
            }
        }
        return ct;
    }
}