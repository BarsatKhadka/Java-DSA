class Solution {
    public int findClosestNumber(int[] nums) {
        
        //if i do absolute and positive number is present then its not a problem because we want the positive in answer. Problem is if the answer is negative itself.
        int []smallestNumber = {Math.abs(nums[0]), 0};

        for(int i=1; i<nums.length; i++){
            if(Math.abs(nums[i]) < smallestNumber[0]){
                smallestNumber[0] = Math.abs(nums[i]);
                smallestNumber[1] = i;
            }

            if(nums[smallestNumber[1]] == nums[i] * -1){
                if(nums[i] > 0){
                    smallestNumber[0] = nums[i];
                    smallestNumber[1] = i;
                }

            }

        }


        return nums[smallestNumber[1]];
       

        
    }
}