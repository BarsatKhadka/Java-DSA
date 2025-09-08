class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        //first full array is going to reverse [1,2,3,4] -> [4, 3,2,1] if k = 2, then what will you do?
        // i would say [3,4,1,2] //reverse each parts
        reverseArr(nums , 0 ,  n-1 );
        reverseArr(nums , 0, k-1);
        reverseArr(nums, k , n-1);
        
    }

    private static void reverseArr(int[] nums, int start, int end){
        while(start<=end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}