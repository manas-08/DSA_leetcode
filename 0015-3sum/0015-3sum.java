class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // List<List<Integer>> al = new ArrayList();
        // for(int i = 0; i < nums.length-2; i++){
        //     for(int j = i+1; j < nums.length-1; j++){
        //         for(int k = j+1; k < nums.length; k++){
        //             if((i != j && j != k && i!= k) && (nums[i] + nums[j] + nums[k] == 0)){
        //                 List<Integer> l= new ArrayList<>();
        //                 l.add(nums[i]);
        //                 l.add(nums[j]);
        //                 l.add(nums[k]);
        //                 al.add(l);
        //             }
        //         }
        //     }
        // }
        // HashSet<HashSet<Integer>> h = new HashSet(al);
        // System.out.println(h);
        // return al;

        Arrays.sort(nums);
        int n = nums.length;
        int i = 0;
        List<List<Integer>> al = new ArrayList<>();
        while (i < n - 2) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                i++;
                continue;
            }
            int j = i + 1;
            int k = n - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum>0) {
                    k--;
                } else if (sum <0) {
                    j++;
                } else {
                    al.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    while (nums[j] == nums[j - 1] && j < k) {
                        j++;
                    }
                }
            }
            if (nums[i] > 0) return al;
            i++;
        }
        return al;
    }
}