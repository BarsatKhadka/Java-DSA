class Solution {
    public int findClosestNumber(int[] nums) {
        
        //track index and number.
        int []smallestNumber = {Math.abs(nums[0]), 0};

    //loop through 1 because 0 is already the default small.
        for(int i=1; i<nums.length; i++){
            //check and all in absolute and find the most small
            if(Math.abs(nums[i]) < smallestNumber[0]){
                smallestNumber[0] = Math.abs(nums[i]);
                smallestNumber[1] = i;
            }

            //till above we are not worrying about duplicate conditions like -1,1 (in these type of case we have to return positive one) 
            //So if at this point if i try to access index then it will give whatever -1 or 1 , the earlier index. So it may be right or not right.
            //To solve that:

            //we check if multiplying with -1 to the current smallestNumber will equal. If yes then it is the negative version and also check if it is not otherwise like multiplying negative number then replacing its indeces , so second check.
            if(nums[smallestNumber[1]] == nums[i] * -1 && nums[i] >0){
                    smallestNumber[0] = nums[i];
                    smallestNumber[1] = i;

            }

        }


        return nums[smallestNumber[1]];
       

        
    }
}