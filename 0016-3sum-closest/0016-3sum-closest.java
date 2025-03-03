class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closestSum = Integer.MAX_VALUE;
        for(int i=0; i<nums.length-2; i++){
            int rptr = i+1;
            int lptr = nums.length -1;
            while(rptr <lptr){
                int currentSum = nums[i] + nums[rptr] + nums[lptr];
                if(Math.abs(currentSum - target) < Math.abs(closestSum - target)) {
                    closestSum =currentSum;

                }
                if(currentSum < target){
                    rptr +=1;
                }
                else{
                    lptr -=1;
                }
            }
        }
        return closestSum;
        

        
        
    }
}