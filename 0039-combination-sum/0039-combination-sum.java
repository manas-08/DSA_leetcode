class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        dfs(target, candidates, new ArrayList<Integer>(), list, 0);
        return list;
    }
    public void dfs(int target, int[] candidates, List<Integer> combination, List<List<Integer>> list, int start){
        if(target < 0){
            return;
        }
        if (target == 0){
            list.add(new ArrayList<Integer>(combination));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            combination.add(candidates[i]);
            dfs (target - candidates[i], candidates, combination, list, i);
            combination.remove(combination.size() - 1);
        }
    }
}