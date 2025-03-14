class Solution {
    public int minZeroArray(int[] nums, int[][] queries) {
        int n = nums.length, sum = 0, k = 0;
        int[] diffArray = new int[n+1];

        for(int i= 0; i < n; i++){
            while(sum + diffArray[i] < nums[i]){
                k++;

                if(k> queries.length){
                    return -1;
                }
                int left = queries[k-1][0], right = queries[k-1][1], val = queries[k-1][2];

                if(right >= i){
                    diffArray[Math.max(left, i)] += val;
                    diffArray[right+1] -= val;
                }
            }
            sum += diffArray[i];
        }
    return k;
    }

}