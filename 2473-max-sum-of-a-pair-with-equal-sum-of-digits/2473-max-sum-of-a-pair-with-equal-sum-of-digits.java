class Solution {
    public int maximumSum(int[] nums) {
        int[] arr = new int[82];
        Arrays.fill(arr, -1);
        int result = -1;

        for (int num : nums) {
            int sumOfDigits = 0, tmp = num;
            while (tmp > 0) {
                sumOfDigits += tmp % 10;
                tmp /= 10;
            }

            if (arr[sumOfDigits] != -1)
                result = Math.max(result, num + arr[sumOfDigits]);

            arr[sumOfDigits] = Math.max(arr[sumOfDigits], num);
        }
        return result;
    }
}