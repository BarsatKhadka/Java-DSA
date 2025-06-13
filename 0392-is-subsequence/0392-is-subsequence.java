class Solution {
    public boolean isSubsequence(String s, String t) {
        int sptr = 0;
        int tptr = 0;
        while(sptr < s.length() && tptr < t.length()){
            if(s.charAt(sptr) == t.charAt(tptr)){
                sptr++;
            }
            tptr++;

        }

        return sptr == s.length();
        
    }
}