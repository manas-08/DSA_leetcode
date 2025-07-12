class Solution {
    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) return new int[]{-1,-1};
        int first = binarySearchForFirstPos(nums, target);
        int last = binarySearchForLastPos(nums, target);
        int[] res = {first, last};
        return res;
    }
    public static int binarySearchForLastPos(int[] arr, int x){
        int last = -1;
        int low = 0;
        int high = arr.length -1;
        int mid  = -1;
        while(low <= high){
        mid = low + (high - low) / 2;
        if (mid == arr.length -1 && arr[mid] == x) return arr.length-1;
        if (arr[mid] == x){
            if(arr[mid] == arr[mid+1]){
                low = mid + 1;
                last = mid + 1;
            }
            else{
                last = mid;
                return last;
            }
        }
        else if (arr[mid] < x){
            low = mid +1;
        }
        else {
            high = mid - 1;
            }
        }
        return -1;
    }
    public static int binarySearchForFirstPos(int[] arr, int x){
        int first = -1;
        int low = 0;
        int high = arr.length -1;
        int mid  = -1;
        while(low <= high){
        mid = low + (high - low) / 2;
        if (mid == 0 && arr[mid] == x) return 0;
        if (arr[mid] == x){
            if(arr[mid] == arr[mid-1]){
                high = mid - 1;
                first = mid - 1;
            }
            else{
                first = mid;
                return first;
            }
        }
        else if (arr[mid] < x){
            low = mid +1;
        }
        else {
            high = mid - 1;
            }
        }
        return -1;
    }
}




// public int[] searchRange(int[] nums, int target) {
        // int start = 0;
        // int end = nums.length - 1;
        // while(start <= end){
        //     int mid = start + ((end - start) / 2);     // better way to calculate middle index [just some simple maths]
        //     if(nums[mid] < target){
        //         start = mid + 1;
        //     }
        //     else if(nums[mid] > target){
        //         end = mid - 1;
        //     }
        //     else{
        //         int left_idx = searchRange(nums, target, 0, mid - 1);
        //         int right_idx = searchRange(nums, target, mid + 1, nums.length - 1);
        //         if(left_idx == -1 && right_idx == -1){
        //             return new int[]{mid, mid};
        //         }
        //         else if(left_idx == -1){
        //             return new int[]{mid, right_idx};
        //         }
        //         else if(right_idx == -1){
        //             return new int[]{left_idx, mid};
        //         }
        //         return new int[]{left_idx, right_idx};
        //     }
        // }
        // return new int[]{-1, -1};
    //}
    // public int searchRange(int[] nums, int target, int start, int end){
    //     while(start <= end){
    //         int mid = start + ((end - start) / 2);     // better way to calculate middle index [just some simple maths]
    //         if(nums[mid] < target){
    //             start = mid + 1;
    //         }
    //         else if(nums[mid] > target){
    //             end = mid - 1;
    //         }
    //         else{
    //             return mid;
    //         }
    //     }
    //     return -1;
    // }