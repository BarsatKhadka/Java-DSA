class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i: nums){
            set.add(i);
        }
        int count = 0;
        for(int i: set){
            
            if(!set.contains(i-1)){
            int currentNumber = i;
            int currCount = 1;
            while(set.contains(currentNumber +1)){
                currentNumber++;
                currCount++;
            } 
            count = Math.max(currCount,count);

            }
        }
        return count;
        
    }
}