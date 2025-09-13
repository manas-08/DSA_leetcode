class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character, Integer> vowels = new HashMap();
        HashMap<Character, Integer> consonants = new HashMap();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowels.put(ch, vowels.getOrDefault(ch, 0)+1);
            }
            else{
                consonants.put(ch, consonants.getOrDefault(ch, 0)+1);
            }
        }
        // finding the one with the max frequency 
        int max1 = 0;
        int max2 = 0;
        for(Map.Entry<Character, Integer> entry1: vowels.entrySet()){
            if(entry1.getValue() > max1){
                max1 = entry1.getValue();
            }
        }
        for(Map.Entry<Character, Integer> entry2: consonants.entrySet()){
            if(entry2.getValue() > max2){
                max2 = entry2.getValue();
            }
        }
        return max1+max2;
    }
}