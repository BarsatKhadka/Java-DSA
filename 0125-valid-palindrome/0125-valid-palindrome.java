class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int leftPtr = 0;
        int rightPtr = s.length() -1;
        while(leftPtr < rightPtr){
            if(s.charAt(leftPtr) == s.charAt(rightPtr)){
                leftPtr++;
                rightPtr--;
            }
            else{
                return false;
            }
        }
        return true;
        
    }
}