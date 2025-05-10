class Solution {
    public void rotate(int[][] matrix) {
        //first taking transpose of matrix through swapping.
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix.length; j++) {
                swap(i, j, matrix);
            }
        }
        //then swapping the first and last element till middle index to acheive the desired result.
        for (int row = 0; row < matrix.length; row++) {
            int temp = 0;
            for (int k = 0; k < matrix.length && k < matrix.length / 2; k++) {
                temp = matrix[row][k];
                matrix[row][k] = matrix[row][matrix.length - 1 - k];
                matrix[row][matrix.length - 1 - k] = temp;
            }
        }
        // for (int i = 0; i < matrix.length; i++) {                FOR PRINTING
        //     for (int j = 0; j < matrix.length; j++) {
        //         System.out.print(matrix[i][j] + " ");
        //     }
        //     System.out.println();
        // }
    }
    public void swap(int i, int j, int[][] matrix) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }
}