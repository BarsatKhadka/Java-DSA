class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        int top = 0;
        int bottom = rows - 1;
        while(top <= bottom){
            int midRow = (top+bottom)/2;
            if(target < matrix[midRow][0]){
                bottom = midRow -1;
            }
            else if(target >matrix[midRow][cols - 1]){
                top = midRow + 1;
            }
            else{
                break;
            }
        }

        if(top > bottom){
            return false;
        }

        int targetRow = (top+bottom)/2;
        int left = 0;
        int right = cols -1;
        while(left <= right){
            int mid = (left + right)/2;
            if(target == matrix[targetRow][mid]){
                return true;
            }
            if(target > matrix[targetRow][mid]){
                left = mid + 1;
            }
            if(target < matrix[targetRow][mid]){
                right = mid -1;
            }
        }

        return false;
        
    }
}