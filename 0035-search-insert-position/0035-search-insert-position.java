class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int mid = -1;
        while(start <= end){
            mid = start + ((end - start) / 2);     // better way to calculate middle index [just some simple maths]
            if(nums[mid] < target){
                start = mid + 1;
            }
            else if(nums[mid] > target){
                end = mid - 1;
            }
            else{
                return mid;
            }
        }
        if(target < nums[mid]){   // if the target element is still smaller than mid ele, then return start position
            return start;
        }
        return mid + 1;
    }
}//// Note: Always remember mid position cannot go out of obund, we only move start and mid positions, right?