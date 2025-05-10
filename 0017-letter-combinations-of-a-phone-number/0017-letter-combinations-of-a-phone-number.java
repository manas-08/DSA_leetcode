class Solution {
    public List<String> letterCombinations(String digits) {
        ArrayList<String> list = new ArrayList<>();
        return letterCombinationRet("", digits, list);
    }
    public ArrayList<String> letterCombinationRet(String p, String up, ArrayList<String> list){ 
        if (up.isEmpty()) {
            if(p.isEmpty()){
                return list;
            }
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) - '0';   // to convert char into number, such as '2' into 2, what you are doing is subtracting '0' character ASCII value from the character(u are getting from string) ASCII value
        if (digit == 7) {
            for (int i = 15; i <= 18; i++) {
                char c = (char) ('a' + i);
                letterCombinationRet(p + c, up.substring(1), list);
            }
        } else if (digit == 8) {
            for (int i = 19; i <= 21; i++) {
                char c = (char) ('a' + i);
                letterCombinationRet(p + c, up.substring(1), list);
            }
        } else if (digit == 9) {
            for (int i = 22; i <= 25; i++) {
                char c = (char) ('a' + i);
                letterCombinationRet(p + c, up.substring(1), list);
            }
        } else {
            for (int i = (digit - 2) * 3; i < (digit-1) * 3; i++) {
                char c = (char) ('a' + i);
                letterCombinationRet(p + c, up.substring(1), list);
            }
        }
        return list;
    }
}