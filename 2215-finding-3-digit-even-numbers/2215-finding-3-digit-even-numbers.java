class Solution {
    public int[] findEvenNumbers(int[] digits) {
        Set<Integer> combs = new HashSet<>();
        int len = digits.length;
        for(int i = 0; i < len; i++){
            for(int j = 0; j < len; j++){
                for(int k = 0; k < len; k++){
                    if(i == j || j == k || i == k) continue;  // same digits ko pakadkar nhi chalna hai..
                    int comb = digits[i] * 100 + digits[j] * 10 + digits[k];
                    if(digits[i] * 100 + digits[j] * 10 + digits[k] >= 100 && ((digits[i] * 100 + digits[j] * 10 + digits[k]) % 2 == 0)){
                        combs.add(comb);
                    }
                }
            }
        }

        ArrayList<Integer> l = new ArrayList<Integer>(combs);
        Collections.sort(l);
        int[] result = new int[l.size()];
        for(int i = 0; i < l.size(); i++){
            result[i] = l.get(i);
        }

        return result;
    }
}