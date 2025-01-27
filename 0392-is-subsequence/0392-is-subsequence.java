class Solution {
    public boolean isSubsequence(String s, String t) {
        //two pointers man
        int Sptr = 0;
        int Tptr = 0;
        int approvedCount = 0;

        
        while(Tptr < t.length() && Sptr < s.length() ){
            if(s.charAt(Sptr) == t.charAt(Tptr)){
                Sptr +=1;
                Tptr += 1;
                approvedCount +=1;
            }
            else{
                Tptr += 1;
            }
        }

        return approvedCount == s.length();
        
    }
}