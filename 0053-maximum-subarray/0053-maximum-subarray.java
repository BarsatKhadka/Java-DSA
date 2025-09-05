class Solution {
    public int maxSubArray(int[] nums) {
        int currentSum = 0;
        int maxSum = nums[0];
        for(int n:nums){
            currentSum = Math.max(n+currentSum , n);
            maxSum = Math.max(currentSum, maxSum);
        }
        return maxSum;
        
    }
}