class Solution {
    public List<String> summaryRanges(int[] nums) {
        ArrayList<String> result = new ArrayList<>();

        int firstIndex = 0;
        for(int i=0; i<nums.length; i++){

            if(i<nums.length -1 && nums[i] + 1 != nums[i+1] ){
                if(nums[firstIndex] != nums[i]){
                result.add(String.valueOf(nums[firstIndex]) + "->" + String.valueOf(nums[i]));
                }
                else{
                    result.add(String.valueOf(nums[firstIndex]));
                }
                firstIndex = i+1;
            }

        }
    //this is done at last so after loop obviously
        if(firstIndex == nums.length -1){
                result.add(String.valueOf(nums[firstIndex]));
            }
            
            if(firstIndex < nums.length-1){
                result.add(String.valueOf(nums[firstIndex]) + "->" + String.valueOf(nums[nums.length-1]));
            }

        return result;
        
    }
}