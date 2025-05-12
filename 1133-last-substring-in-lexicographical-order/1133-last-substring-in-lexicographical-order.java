class Solution {
    // Code works, but TLE problem
    // HashSet<String> al = new HashSet<String>();
    // public String lastSubstring(String s) {
    //     for(int i = 0; i < s.length(); i++){
    //         generateSubstrings(i, s, s.length());
    //     }
    //     ArrayList<String> listOfSubstrings = new ArrayList<>(al);
    //     Collections.sort(listOfSubstrings);
    //     return listOfSubstrings.get(listOfSubstrings.size()-1);
    // }
    // public void generateSubstrings(int start, String s, int len){
    //     for(int i = start; i < len; i++){
    //         al.add(s.substring(start, i+1));
    //     }
    // }

       public String lastSubstring(String s) {
        int i = 0, j = 1, offset = 0, len = s.length();
        while (i + offset < len && j + offset < len) {
            char c = s.charAt(i + offset), d = s.charAt(j + offset);
            if (c == d) {
                ++offset;
            }else {
                if (c < d)  { i += offset + 1; }
                else { j += offset + 1; } 
                if (i == j) { ++j; }  
                offset = 0; 
            }
        }
        return s.substring(i);
    }
}