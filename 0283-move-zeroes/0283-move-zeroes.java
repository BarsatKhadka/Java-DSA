class Solution {
    public void moveZeroes(int[] nums) {
        int leftPtr = 0;
        for(int rightPtr=0; rightPtr<nums.length ; rightPtr++){
            if(nums[rightPtr] !=0){
                int temp = nums[leftPtr];
                nums[leftPtr] = nums[rightPtr];
                nums[rightPtr] = temp;
                leftPtr +=1;
            }
        }

        
    }
}