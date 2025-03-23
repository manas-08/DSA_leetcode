class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int mid = nums.length / 2;
        return nums[mid];        // since, the majority element will occur more than half the size of aaray, therefore it will be present at the mid index for sure[after sorting].
    }
}