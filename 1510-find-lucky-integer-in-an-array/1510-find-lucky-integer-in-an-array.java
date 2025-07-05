class Solution {
    public int findLucky(int[] arr) {
        int[] freqArr = new int[501];
        for(int num : arr){ // freq count
            freqArr[num]++;
        }
        int luckyNumber = -1;
        for(int i = 1; i < freqArr.length; i++){
            if(freqArr[i] == i){
                luckyNumber = i;
            }
        }
        return luckyNumber; 
    }
}