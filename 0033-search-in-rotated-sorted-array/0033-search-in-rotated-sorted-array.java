class Solution {
    public int search(int[] nums, int target) {
        if(nums.length == 1){
            return binarySearch(nums, target, 0, 0);
        }

        int pivot = findingPivot(nums);
        if(pivot == -1){
            return binarySearch(nums, target, 0, nums.length - 1);  // if pivot doesn't exist, it means it is not rotated and sorted fully in ascending order, thus apply simple BS...
        }

        // conditions to find target if pivot is there!!
        if(nums[pivot] == target){
            return pivot;
        }
        if(target >= nums[0]){
            return binarySearch(nums, target, 0, pivot - 1);
        }
    return binarySearch(nums, target, pivot + 1, nums.length - 1);
}

    public int findingPivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases will be there:
            if (mid < end && nums[mid] > nums[mid + 1]){
                return mid;   // it will be the pivot element (at mid only)
            }
            if(start < mid && nums[mid] < nums[mid - 1]){
                return mid - 1;
            }
            // deciding which part to search in..
            if(nums[mid] < nums[start]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
    // normal BS
    int binarySearch(int[] arr, int target, int start, int end){
        while(start <= end){
            int mid = start + ((end - start) / 2);
            if(arr[mid] < target){
                start = mid + 1;
            }
            else if(arr[mid] > target){
                end = mid - 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}