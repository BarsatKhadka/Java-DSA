class Solution {
    public int removeDuplicates(int[] nums) {
        int left = 1;
        for(int right = 1; right<nums.length; right++){
            if(nums[right-1] != nums[right]){
                nums[left] = nums[right];
                left +=1;
            }
        }

        return left;
        
    }
}