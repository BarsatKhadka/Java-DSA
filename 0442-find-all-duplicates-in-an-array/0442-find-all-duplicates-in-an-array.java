class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        List<Integer> result = new ArrayList<>();
        for(int i: nums){
            if(set.contains(i)){
                result.add(i);
            }
            else{
                set.add(i);
            }
        }
        return result;
        
    }
}