/***********************************************

Time Complexity : O(n * n), O(81)
Space Complexity : O(1)

https://leetcode.com/problems/valid-sudoku/

***********************************************/

class Solution {
    
    char[] validCharacters = new char[]{'.', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    
    public boolean isValidSudoku(char[][] board) {
        
        Set<String> seen = new HashSet();      
        
        for(int i = 0; i < 9; i ++) {
            for(int j = 0; j < 9; j++) {
                char number = board[i][j];
                if(!isValidaCharacter(number)) {
                    return false;                   
                }
                if(number != '.') {
                    if (!seen.add(number + " in row " + i) ||
                    !seen.add(number + " in column " + j) ||
                    !seen.add(number + " in block " + i/3 + "-" + j/3))
                        return false;
                }
            }
        }      
        
        return true;
    }  
    
    public boolean isValidaCharacter(char c) {
        
        boolean match = false;
        
        for(int i = 0; i < validCharacters.length; i++) {
            if(validCharacters[i] == c) {
                match = true;
                break;
            }
        }
        
        return match;
    }
}

//////////////////////// More Efficient ////////////////////////////////////////////////

class Solution {
   
    public boolean isValidSudoku(char[][] board) {
        
        for(int i = 0; i < 9; i++){
            boolean[] rowCheck = new boolean[9];
            boolean[] colCheck = new boolean[9];
            boolean[] boxCheck = new boolean[9];
            
            for(int j = 0; j< 9; j++){
                // Row
                if(board[i][j] == '.'){}                 
                else if(rowCheck[board[i][j] - '1']) 
                    return false;
                else 
                    rowCheck[board[i][j] - '1'] = true;
                
                // Column
                if(board[j][i] == '.'){}
                else if(colCheck[board[j][i] - '1']) 
                    return false;
                else 
                    colCheck[board[j][i] - '1'] = true;
                
                // Box
                int m = (i / 3 * 3) + (j / 3);
                int n = (i % 3 * 3) + (j % 3);
                if(board[m][n] == '.') {}
                else if(boxCheck[board[m][n] - '1']) 
                    return false;
                else 
                    boxCheck[board[m][n] - '1'] = true;
            }
        }
        
        return true;
    }  
}
    



