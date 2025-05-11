class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while(i < nums.length){                      // solving the problem in O(n) time complexity
            int correct = nums[i] - 1;             // correct positon for the element at ith index...
            if(correct != i && nums[correct] != nums[i]){
                int temp = nums[correct];
                nums[correct] = nums[i];
                nums[i] = temp;
            }
            else {
                i++;
            }
        }
        // after swapping...
        List<Integer> ans = new ArrayList<Integer>();
        for(int j = 0; j < nums.length; j++)
        {
            if(nums[j] != j + 1){       // it means the element is not in correct position and therefore it is duplicate..
                ans.add(j + 1);       // due to the presence of duplicate elements, after sorting they will not be at the correct position, the jth position should have (j + 1) value wich is vanished.. 
            }
        }
        return ans;
    }
}