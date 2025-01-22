class Solution {
    public int[] searchRange(int[] nums, int target) {

        int start = 0;
        int end = nums.length -1;
        int []result = {-1,-1};


//automatically this finds the last occurence
        while(start<=end){
            int mid = start + (end-start)/2;

            if(nums[mid] == target){
                result[1] = mid;
                start = mid + 1;
            }
            
            if(nums[mid] > target){
                end = mid -1;
            }
            if(nums[mid] < target){
                start = mid + 1;

            }
        }
     //but before starting to find first occurence again, i need to reset start   
 start = 0;
//binary search to find first occurence and assigining it to 0 - first index.
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid] == target){
                result[0] = mid;
                end = mid -1 ;
            }
            if(nums[mid] > target){
                end = mid-1;
            }
            if(nums[mid]< target){
                start = mid + 1;
            }
        }


        return result;
        
    
        
    }
}