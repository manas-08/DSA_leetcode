class Solution {
    public int hammingWeight(int n) {
        // String N = Integer.toBinaryString(n);
        // int k = (Integer.parseInt(N, 2));
        int count = 0;
        while(n > 0){
            count++;
            n = n & n - 1;
        }
        return count;
    }
}