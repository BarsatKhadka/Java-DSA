class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> seen = new HashSet<>();
        int i = 0;
        int j = 0;
        int maxSize = 0;

        while(j<s.length()){
            if(!seen.contains(s.charAt(j))){
                seen.add(s.charAt(j));
                j++;
            }
            else{
                seen.remove(s.charAt(i));
                i++;

            }
            maxSize = Math.max(seen.size(), maxSize);

        }      
        return maxSize;  
    }
}