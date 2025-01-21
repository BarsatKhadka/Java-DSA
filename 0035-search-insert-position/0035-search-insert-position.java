class Solution {
    public int searchInsert(int[] nums, int target) {
        //if the target is greater than last element of num , then its insert postion will always be the last index
        if(target > nums[nums.length -1]){
            return nums.length;
        }

        int start = 0;
        int end = nums.length -1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid] > target){
                end = mid -1;
            }
            if(nums[mid] < target){
                start = mid + 1;
            }
        }

        //at the end one index will remain , although it will be the index of floor , not ceiling so + 1 
        return end + 1;
        
    }
}