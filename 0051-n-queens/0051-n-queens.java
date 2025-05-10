class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> list = new ArrayList<>();
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        nQueens(0, board, list);
        return list;
        }

    public List<String> construct(char[][] board){
        List<String> str = new ArrayList<>();
        for(int i =0;i<board.length;i++){
            String row = new String(board[i]);
            str.add(row);
        }
        return str;
    }

    public void nQueens(int r, char[][] board, List<List<String>> list){
        if(r == board.length){
            list.add(construct(board));
            return;
        }
        for (int c = 0; c < board.length; c++) {
            if(isSafe(r, c, board) == 1){
                board[r][c] = 'Q';      // mark it visited
                nQueens(r+1, board, list);
                board[r][c] = '.';      // restore it as initial state
            }
        }
    }
    public int isSafe(int r, int c, char[][] board){                  // to check for, if already a queen exists in attacking path
        // for vertical row
        for (int i = 0; i < r; i++) {
            if(board[i][c] == 'Q') {
                return -1;
            }
        }
        // for left diagonal
        for (int i = 1; i <= Math.min(r, c); i++) {
            if(board[r-i][c-i] == 'Q'){
                return -1;
            }
        }
        // for right diagonal
        for (int i = 1; i <= Math.min(r, board.length - c - 1); i++) {
            if(board[r-i][c+i] == 'Q'){
                return -1;
            }
        }
        return 1;
    }
}