class Solution {
    public int findKthPositive(int[] arr, int k) {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            int missing = arr[mid] - (mid + 1);      // here, missing variable tells how much no. of elements are missing before mid, if it is less than k, we explore right space(after mid).... 
            if(missing < k){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return (end + 1 + k);                  
    }
}