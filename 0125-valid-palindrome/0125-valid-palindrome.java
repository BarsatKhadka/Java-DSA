class Solution {
    public boolean isPalindrome(String s) {
        String newS = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        int rptr = newS.length() -1;
        for(int lptr = 0; lptr< newS.length()/2; lptr++){
            if(newS.charAt(lptr) != newS.charAt(rptr)){
                return false;
            }
            rptr--;
        }

        return true;
        
    }
}