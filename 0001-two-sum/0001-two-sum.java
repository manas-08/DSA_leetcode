class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] resultIndices = new int[2];   // array will store the indices of such pair.
        for(int i = 0; i < nums.length - 1; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    resultIndices[0] = i;
                    resultIndices[1] = j;
                    break;   // once a pair is found no need to found...
                }
        }
    }
        return resultIndices;
    }
}