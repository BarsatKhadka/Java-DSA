class Solution {
    public boolean containsDuplicate(int[] nums) {

        Set<Integer> hashSet = new HashSet<>();

        for(int i=0; i< nums.length; i++){

            //if this returns false then num is already in set
           boolean isAdded = hashSet.add(nums[i]);

           //if the number is already in the set then return true (read the qsn carefully)
           if(!isAdded){
            return true;
           }
            

        }

        return false;
        
        
    }
}