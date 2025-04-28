class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int lastElement = nums[nums.length -1];
        while(left<=right){
            int mid = (left + right)/2;
            if(nums[mid] > lastElement){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }

        return nums[left];
        
        
    }
}