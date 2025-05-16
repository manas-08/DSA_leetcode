class Solution {
    static boolean[][] checked;
    public boolean exist(char[][] board, String word) {
        checked = new boolean[board.length][board[0].length];
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                if((word.charAt(0) == board[i][j]) && wordSearch(board, word, i, j, 0)) return true;
            }
        }
        return false;    
    }
    public boolean wordSearch(char[][]board, String word, int i, int j, int idx){
        if(idx == word.length()) return true;
        if(i >= board.length || i < 0 || j >= board[i].length || j < 0 || board[i][j] != word.charAt(idx) || checked[i][j]) return false;
        checked[i][j] = true;
        if(wordSearch(board, word, i-1, j, idx+1) || 
           wordSearch(board, word, i+1, j, idx+1) ||
           wordSearch(board, word, i, j-1, idx+1) || 
           wordSearch(board, word, i, j+1, idx+1)){
            return true;
        }
        // backtracking, mark it unvisited/not-checked
        checked[i][j] = false;
        return false;
    }
}