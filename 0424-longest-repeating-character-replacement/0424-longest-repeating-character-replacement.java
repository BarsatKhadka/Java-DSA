class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> letterCount = new HashMap<>();
        int l = 0;
        int maxFreq = 0;
        int res = 0;

        for(int r=0; r<s.length(); r++){
            char currentChar = s.charAt(r);
            letterCount.put(currentChar, letterCount.getOrDefault(currentChar,0) + 1);
            maxFreq = Math.max(maxFreq,letterCount.get(currentChar));

            while((r-l + 1)- maxFreq > k){
                char left = s.charAt(l);
                letterCount.put(left, letterCount.get(left) -1);
                l++;
            }

            res = Math.max(res,r-l+1);



        }
        return res;
        
        
    }
}