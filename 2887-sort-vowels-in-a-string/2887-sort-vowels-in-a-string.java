class Solution {
    public String sortVowels(String s) {
        StringBuilder t = new StringBuilder();
        ArrayList<Character> l = new ArrayList<>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u' || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'U'|| s.charAt(i) == 'I'|| s.charAt(i) == 'O')  l.add(s.charAt(i));
        }
        int idx = 0;
        Collections.sort(l); // based on ASCII val
        
        String str = "aeiouAEIOU";
        for(int i = 0; i < s.length(); i++){
            if(str.contains((s.valueOf(s.charAt(i))))) {
                t.append(l.get(idx));
                idx++;
            }
            else{
                t.append(s.charAt(i));
            }
        }
        return t.toString();
    }
}