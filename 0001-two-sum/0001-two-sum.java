class Solution {
    public int[] twoSum(int[] nums, int target) {
        int []results = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<nums.length ; i++){
            map.put(nums[i],i);
        }

        for(int j=0; j<nums.length; j++){
            if(map.containsKey(target - nums[j]) && j!=map.get(target-nums[j])){
                results[0] = j;
                results[1] = map.get(target-nums[j]);
            }
        }

        return results;





    }
}