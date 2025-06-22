class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0) continue;
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int lptr = i+1;
            int rptr = nums.length -1;
            while(lptr < rptr){
                if(nums[i]+ nums[lptr] + nums[rptr] > 0){
                    rptr--;
                }
                else if(nums[i] + nums[lptr] + nums[rptr] <0){
                    lptr++;
                }
                else{
                    result.add(Arrays.asList(nums[i], nums[lptr], nums[rptr]));
                    lptr++;
                    rptr--;
                    while(lptr < rptr && nums[lptr] == nums[lptr-1]){
                        lptr++;
                    }

                }
            }

        }

        return result;

        
    }
}