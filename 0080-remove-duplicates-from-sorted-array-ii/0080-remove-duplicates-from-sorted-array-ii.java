class Solution {
    public int removeDuplicates(int[] nums) {
        // two-pointer approach
        // i-  traversing and keeping track for current elements
        int j = 0; // pointer for unique ele
        int occur = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[j] && i==1){
                nums[1] = nums[0];
                j++;
            }
            else if(nums[i] != nums[j]){
                nums[++j] = nums[i];
                if(occur != 1) occur++;
            }
            else if(nums[i] == nums[j] && occur == 1){
                occur = 0;
                nums[++j] = nums[i];
            }
        }
        return j+1;
    }
}