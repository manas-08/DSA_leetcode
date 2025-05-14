class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for (int num : nums) {
            int n = outer.size();  // size of outer arrayList
            for (int i = 0; i < n; i++) {
                List<Integer> inner = new ArrayList<>(outer.get(i));         // we are taking element of outer and adding the array element to it at each level
                inner.add(num);
                outer.add(inner);
            }
        }
        return outer;
    }
}