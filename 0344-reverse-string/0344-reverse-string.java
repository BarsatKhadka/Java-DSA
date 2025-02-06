class Solution {
    public void reverseString(char[] s) {
        int lptr = 0;
        int rptr = s.length -1;
        while (lptr <= rptr){
            //storing the temporary so that it persists while reversing.
            char temp = s[lptr];
            s[lptr] = s[rptr];
            s[rptr] = temp;
            lptr++;
            rptr--;

        }
        
        
    }
}