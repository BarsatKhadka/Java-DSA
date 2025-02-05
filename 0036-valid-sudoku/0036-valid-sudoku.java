class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0; i<9; i++){
            HashSet<Character> rows = new HashSet<>();
            for(int j=0; j<9; j++){
                if(!rows.add(board[i][j]) && board[i][j] != '.'){
                    return false;
                }
                rows.add(board[i][j]);

            }
        }

        for(int i=0; i<9; i++){
            HashSet<Character> columns = new HashSet<>();
            for(int j=0; j<9; j++){
                if(!columns.add(board[j][i]) && board[j][i] != '.'){
                    return false;
                }
                columns.add(board[j][i]);
            }
        }


       for(int i=0; i < 9; i+= 3){
        for(int j=0; j< 9; j+= 3){
            HashSet<Character> block = new HashSet<>();
            for(int k = i; k<i+3; k++ ){
                for(int l = j; l< j+3; l++){
                    if(!block.add(board[k][l]) && board[k][l] != '.'){
                        return false;
                    }
                    block.add(board[i][j]);
                }
            }
        }

        
       }





       return true; 
        
    }
}