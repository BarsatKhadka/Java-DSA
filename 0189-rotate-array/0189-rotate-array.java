class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        int []arr1 = Arrays.copyOfRange(nums, 0 , n-k);
        int []arr2 = Arrays.copyOfRange(nums , n-k, nums.length);
        int []resultArr = new int[nums.length];
        int index = 0;
        for(int i : arr2){
            nums[index++] = i;
        }
        for(int i : arr1){
            nums[index++] = i;
        }


        
    }
}