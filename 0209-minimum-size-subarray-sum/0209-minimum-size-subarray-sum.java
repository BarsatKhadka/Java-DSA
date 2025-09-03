class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        if(nums[0] >= target) return 1;
    
        int result = Integer.MAX_VALUE;
        int sum = nums[0];
        int leftPtr = 0;
        for(int rightPtr = 1; rightPtr < nums.length; rightPtr++){
            if (nums[rightPtr] >= target) return 1;
            sum += nums[rightPtr];

            while(sum >= target){
                result = Math.min(result, rightPtr - leftPtr+1);
                sum -= nums[leftPtr];
                leftPtr++;
                
            }

        }

        return result == Integer.MAX_VALUE ? 0: result;


        
    }
}