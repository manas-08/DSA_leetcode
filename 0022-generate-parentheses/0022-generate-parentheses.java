class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        generate("", 0, 0, n, list);
        return list;
    }
    public void generate(String p, int open, int closed, int n, List<String> list){
        if(open == n && closed == n){
            list.add(p);
            return;
        }
        if(open < n){
            generate(p+'(', open + 1, closed, n, list);
        }
        if(open > closed){                            // it maintains the validity of the problem, that ')' should not come before '(' in the first place.
            generate(p+')', open, closed + 1, n, list);
        }
    }
}