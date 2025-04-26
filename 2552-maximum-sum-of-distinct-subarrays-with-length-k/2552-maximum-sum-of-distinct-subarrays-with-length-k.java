class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        
        int leftPtr = 0;
        long result = 0;
        long currentSum = 0;
        for(int i=0; i<nums.length; i++){
            
            currentSum += nums[i];
            map.put(nums[i], map.getOrDefault(nums[i] , 0) + 1);

            if(i-leftPtr + 1 > k ){
                map.put(nums[leftPtr], map.get(nums[leftPtr]) -1 );
                if(map.get(nums[leftPtr]) == 0){
                    map.remove(nums[leftPtr]);
                }
                currentSum -= nums[leftPtr];
                leftPtr++;
            }
            if(map.size() == k && i-leftPtr + 1 ==k){
                result = Math.max(currentSum , result);
            }
        }
        return result;
        
    }
}