class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> uniqueJewels = new HashSet<>();
        int commonCount = 0;

        for(int i=0; i<jewels.length(); i++){
            uniqueJewels.add(jewels.charAt(i));
        }

        for(int i=0; i<stones.length(); i++){
            if(uniqueJewels.contains(stones.charAt(i))){
                commonCount +=1;
            }
        }

        return commonCount;




        
    }
}