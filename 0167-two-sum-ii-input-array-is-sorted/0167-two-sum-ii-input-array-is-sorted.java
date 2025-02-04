class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int endIndex = numbers.length - 1;
    
        int lptr = 0;
        int rptr = endIndex ;

        while(lptr <= rptr){
            int sum = numbers[lptr] + numbers[rptr];
            if(sum == target){
                return new int[]{lptr+1,rptr+1};
            }
            //if sum is smaller it means left one should be more big (ascending order)
            else if(sum < target){
                lptr +=1;
            }
            else if(sum > target){
                rptr -=1;
            }
        }

        return new int[]{lptr,rptr};
        
    }
}