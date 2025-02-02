class Solution {
    public void rotate(int[][] matrix) {

        int rows = matrix.length;


        //first transpose
        for(int i=0; i<rows; i++){
            for(int j=i; j<rows; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        //then flip horizontally.
        for(int i=0; i<rows; i++){
        int beginPointer = 0;
        int endPointer = rows - 1;
        while(beginPointer <= endPointer){
            int temp = matrix[i][beginPointer];
            matrix[i][beginPointer] = matrix[i][endPointer];
            matrix[i][endPointer] = temp;
            beginPointer +=1;
            endPointer -=1;
        }
        }
    }
}