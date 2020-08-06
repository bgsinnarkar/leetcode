/***********************************************

Time Complexity : O(n * n) 
Space Complexity : O(1)

https://leetcode.com/problems/rotate-image/

https://www.youtube.com/watch?v=SA867FvqHrM

***********************************************/

class Solution {
    public void rotate(int[][] matrix) {
        
        int N = matrix.length;
        
        // transpose the matrix, it will be swap(matrix[i][j], matrix[j][i])
        for(int i = 0; i < N; i++) {
            for(int j = i; j < N; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        
        // Then flip the matrix horizontally
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N/2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][N - 1 - j];
                matrix[i][N - 1 - j] = temp;
            }
        }
    }
}