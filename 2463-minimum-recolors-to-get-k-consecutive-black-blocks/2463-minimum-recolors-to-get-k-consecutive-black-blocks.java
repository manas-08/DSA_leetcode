class Solution {
    public int minimumRecolors(String blocks, int k) {
        // does not give you the min value
        // if(blocks.length() == 1 && blocks.charAt(0) == 'W' && k == 1) return 1;
        // int[] consecutiveCount = new int[blocks.length()];
        // for (int i = 0; i < blocks.length(); i++) {
        //     int countNoOfBlacks = 0;           // it will calculate from each index to right that how many continuous are there.
        //     if(i == blocks.length()- 1 && blocks.charAt(i) == 'B') consecutiveCount[i] = 1;
        //     else if(i == blocks.length()- 1 && blocks.charAt(i) == 'W') consecutiveCount[i] = 0;
        //     else if (blocks.charAt(i) == 'B') {
        //         countNoOfBlacks++;
        //         int j = i + 1;
        //         while (j != blocks.length() && blocks.charAt(j) != 'W') {
        //             countNoOfBlacks++;
        //             j++;
        //         }
        //         consecutiveCount[i] = countNoOfBlacks;
        //     }
        // }
        // // checking first whether any operations are needed.
        // for (int i = 0; i < consecutiveCount.length; i++) {
        //     if (consecutiveCount[i] == k) return 0;
        // }

        // // changing the consecutiveCount array with some min no. of operations.
        // int operations = 0;
        // for (int i = 0; i < consecutiveCount.length; i++) {
        //     if (consecutiveCount[i] == 0) {
        //         consecutiveCount[i] = consecutiveCount[i + 1] + 1;
        //         operations++;
        //         int j = i - 1;
        //         while (j != -1) {
        //             consecutiveCount[j] = consecutiveCount[j + 1] + 1;
        //             j--;
        //         }
        //     }
        //     if (consecutiveCount[0] == k) return operations;
        // }
        // return -1;

        int l = 0, nWhites = 0, operations = Integer.MAX_VALUE;

        for(int right = 0; right < blocks.length(); right++){
            if(blocks.charAt(right) == 'W'){
                nWhites++;
            }

        if(right - l +1 == k){
            operations = Math.min(operations, nWhites);

            if(blocks.charAt(l) == 'W') nWhites--;
            l++;
        }
    }
    return operations;
}
}