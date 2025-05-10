class Solution {
    public int totalNQueens(int n) {
        boolean[][] board = new boolean[n][n];
        return nQueens(0, board);
    }
    public int nQueens(int r, boolean[][] board){
        if(r == board.length){
            return 1;
        }
        int count = 0;
        for (int c = 0; c < board.length; c++) {
            if(isSafe(r, c, board) == 1){
                board[r][c] = true;      // mark it visited
                count += nQueens(r+1, board);
                board[r][c] = false;      // restore it as initial state
            }
        }
        return count;
    }
    public int isSafe(int r, int c, boolean[][] board){                  // to check for, if already a queen exists in attacking path
        // for vertical row
        for (int i = 0; i < r; i++) {
            if(board[i][c]) {
                return -1;
            }
        }
        // for left diagonal
        for (int i = 1; i <= Math.min(r, c); i++) {
            if(board[r-i][c-i]){
                return -1;
            }
        }
        // for right diagonal
        for (int i = 1; i <= Math.min(r, board.length - c - 1); i++) {
            if(board[r-i][c+i]){
                return -1;
            }
        }
        return 1;
    }
}