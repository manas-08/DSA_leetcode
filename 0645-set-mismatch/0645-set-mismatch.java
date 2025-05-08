class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] ans = new int[2];
        boolean[] isIt = new boolean[nums.length + 1];
        for(int num:nums){   // for every element in nums, we are putting true value at its position in isIt array
            if(isIt[num] == false) isIt[num] = true;         // if it is already true, then the correct element is present at the correct position, therefore if duplicate element comes, it will be catched and put into `ans` array's first position in else section.
            else ans[0] = num;
        }
        // after this, the numbers which are not present in nums will have false as their value in the boolean array, just return the index
        
        for (int i = 1; i < isIt.length; i++) {
            if(!isIt[i]){
                ans[1] = i;
            }
        }
        return ans;
    }
}