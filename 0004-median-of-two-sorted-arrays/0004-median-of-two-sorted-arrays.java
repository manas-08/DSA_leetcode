class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int pos = 0;
        int[] res = new int[nums1.length+nums2.length];
        // combining two arrays
        for(pos = 0; pos < nums1.length; pos++){
            res[pos] = nums1[pos];
        }
        for(int i = 0; i < nums2.length; i++){
            res[pos++] = nums2[i];
        }
        Arrays.sort(res);
        double ans = 0;
        int median = (0 + res.length - 1) / 2;
        System.out.println(median);
        if(res.length % 2 != 0){
            ans = (double) res[median];
        }
        else{
            ans = ((double) (res[median] + res[median+1]))/ 2;
        }
        return ans;
    }
}