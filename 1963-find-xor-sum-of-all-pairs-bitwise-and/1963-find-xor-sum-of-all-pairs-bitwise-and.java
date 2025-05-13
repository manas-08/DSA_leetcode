class Solution {
    public int getXORSum(int[] arr1, int[] arr2) {
        // bitwise - and performed for every pair..
        int xorSum1 = 0;
        int xorSum2 = 0;
        for(int i = 0; i < arr1.length; i++){
            xorSum1 = xorSum1 ^ arr1[i];
        }
        for(int i = 0; i < arr2.length; i++){
            xorSum2 = xorSum2 ^ arr2[i];
        }
        return xorSum1 & xorSum2;
    }
}