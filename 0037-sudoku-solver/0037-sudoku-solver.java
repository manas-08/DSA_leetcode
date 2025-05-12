class Solution {
    public void solveSudoku(char[][] board) {
        char[][] board1 = new char[board.length][];
        for (int i = 0; i < board.length; i++) {
            board1[i] = board[i].clone();
        }
        sudokuSolve(board1, 0, 0, board);
    }
    public void sudokuSolve(char[][] board1, int row, int col, char[][] board){
        if(row == board1.length - 1 && col == board1.length){
            for (int i = 0; i < board1.length; i++){
                board[i] = board1[i].clone();       // creates duplicate object..
            }
            return;
        }
        if(col == board1.length){
            sudokuSolve(board1, row+1, 0, board);
            return;
        }
        if(board1[row][col] == '.'){
            for (int choice = 1; choice <= 9; choice++) {
                if(isSafe(board1, row, col, choice)){
                    board1[row][col] = (char)(choice + '0');
                    sudokuSolve(board1, row, col+1, board);
                    board1[row][col] = '.';          // restore the original value
                }
            }
        }
        else{
            sudokuSolve(board1, row, col+1, board);
        }
    }
    public boolean isSafe(char[][] board1, int row, int col, int num){
        char n = (char) (num + '0');
        // in a row
        for (int i = 0; i < board1.length; i++) {
            if(board1[row][i] == n){
                return false;
            }
        }
        // in a column
        for (int i = 0; i < board1.length; i++) {
            if (board1[i][col] == n){
                return false;
            }
        }
        // in the particular sub-grid
        // int sqrt = (int) Math.sqrt(board1.length);
        int rowStart = row - (row % 3);            // (rowStart, colStart) is nothing but the starting co-ordinate of the sub-grid we need to check.
        int colStart = col - (col % 3);
        for (int i = rowStart; i < (rowStart + 3); i++) {
            for (int j = colStart; j < (colStart + 3); j++) {
                if(board1[i][j] == n){
                    return false;
                }
            }
        }
        return true;
    }
}
