class Solution {
    public boolean canJump(int[] nums) {
        int stepsToNext = nums.length -1 ;
        for(int i = nums.length -2; i >= 0; i-- ){
            if(i + nums[i] >= stepsToNext ){
                stepsToNext = i;
            }
        }
        return stepsToNext == 0;

        
    }
}