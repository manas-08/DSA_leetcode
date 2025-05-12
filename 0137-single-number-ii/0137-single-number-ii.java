class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for(int bitIdx = 0; bitIdx < 32; bitIdx++){
            int count = 0;
            for(int num: nums){
                if((num & (1 << bitIdx)) != 0) {count++;}
            }
            if(count % 3 != 0){
                ans = ans | (1 << bitIdx);
            }
        }
        return ans;
    }
}

//HashMap Approach
        // HashMap<Integer, Integer> map = new HashMap<>();

        // for (int element : nums) {
        //     if (map.containsKey(elem)) {
        //         map.put(element, map.get(element) + 1);    // if element already exists, increment count
        //     } 
        //     else {
        //         map.put(element, 1);   // if new element comes
        //     }
        // }
        // for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
        //     if (entry.getValue().equals(1)) {       // only one key has value (count) 1.
        //         return entry.getKey();                 // get that key(nums[element])
        //     } 
        // }
        // return -1;