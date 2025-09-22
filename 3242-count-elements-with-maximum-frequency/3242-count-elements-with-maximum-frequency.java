class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] arr = new int[101];  // freq arr
        for(int num: nums){
            arr[num]++;
        }
        Arrays.sort(arr);
        int max = 0;
        int sum = 0;
        for(int i = 100; i > 0; i--){
            if(max <= arr[i]){
                max = arr[i];
                sum+=arr[i];
            }
        }
        return sum;
    }
}