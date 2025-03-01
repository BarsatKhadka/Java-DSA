class Solution {
    public int findDuplicate(int[] nums) {
        int result = 0;
        HashSet<Integer> set  = new HashSet<>();
        for(int i : nums){
            if(set.contains(i)){
                return i;
            }
            else{
                set.add(i);
            }
        }
        return result;
    }
}