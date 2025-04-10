class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int range = nums.length;
        HashSet<Integer> numberSet = new HashSet<>();
        for(int i=1; i<=range; i++ ){
            numberSet.add(i);
        }

        for(int i=0; i<range; i++){
            numberSet.remove(nums[i]);
        }

        ArrayList<Integer> result = new ArrayList<>(numberSet);

        return result;

    }
}