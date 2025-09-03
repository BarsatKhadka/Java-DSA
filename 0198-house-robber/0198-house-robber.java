class Solution {
    public int rob(int[] nums) {
        int now = 0;
        int prev = 0;
        for(int rob: nums){
            int temp = Math.max(rob+prev, now);
            prev = now;
            now = temp;
        }
        return now;
        
    }
}