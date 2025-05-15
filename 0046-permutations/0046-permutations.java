class Solution {
    List<List<Integer>> ans;
    public List<List<Integer>> permute(int[] nums) {
        ans = new ArrayList<>();
        permutations(new ArrayList<>(), nums);
        return ans;
    }
    public void permutations(List<Integer> l, int[] nums) {
        if (l.size() == nums.length) {
            ans.add(new ArrayList<>(l));
            return;
        }
        
        for (int num: nums) {
            if (!l.contains(num)) {
                l.add(num);
                permutations(l, nums);
                l.remove(l.size() - 1);
            }
        }
    }
}