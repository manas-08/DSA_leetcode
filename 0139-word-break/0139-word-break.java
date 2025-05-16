class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] t = new boolean[s.length()];
        for(int i = 0; i<t.length; i++){
            for(int j=0; j<=i; j++){
                if(j==0 || t[j-1]){
                    if(wordDict.contains(s.substring(j, i+1))){
                        t[i] = true;
                        break;
                    }
                }
            }
        }
        return t[t.length - 1];
    }
}