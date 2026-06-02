import java.util.*;

class Solution {
    // Function to set entire row and column to 0 if an element in the matrix is 0
    public void setZeroes(int[][] matrix) {
        // Get number of rows
        int m = matrix.length;
        // Get number of columns
        int n = matrix[0].length;

        // First pass: mark rows and columns
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // If the cell is zero
                if (matrix[i][j] == 0) {
                    // Mark entire row as 555 (except zeros)
                    for (int col = 0; col < n; col++) {
                        if (matrix[i][col] != 0)
                            matrix[i][col] = 555;
                    }
                    // Mark entire column as 555 (except zeros)
                    for (int row = 0; row < m; row++) {
                        if (matrix[row][j] != 0)
                            matrix[row][j] = 555;
                    }
                }
            }
        }

        // Second pass: replace 555 with 0
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 555)
                    matrix[i][j] = 0;
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Example matrix
        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
        
        // Create Solution object
        Solution sol = new Solution();
        // Modify matrix
        sol.setZeroes(matrix);
        
        // Print result
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
