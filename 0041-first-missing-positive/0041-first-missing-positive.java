class Solution {
    public int firstMissingPositive(int[] nums) {
        int i = 0;
        while(i < nums.length){                      // solving the problem in O(n) time complexity
            int correct = nums[i] - 1;     
            if(nums[i] > 0 && nums[i] < nums.length && correct != i && nums[correct] != nums[i]){      // we just want to put the condition that array element should not be greater than nums length or should not be less than 1, if found, just ignore it!!
                int temp = nums[correct];
                nums[correct] = nums[i];
                nums[i] = temp;
            }
            else {
                i++;
            }
        }
        for(int j = 0; j < nums.length; j++){
            if(nums[j] != j + 1){
                return j + 1;
            }
        }
        return nums.length + 1;
    }
}