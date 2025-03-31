class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        if(target == 'z' && target == letters[letters.length -1]){
            return letters[0];
        }
        int left = 0; int right = letters.length -1 ;
        while(left<=right){
            int mid = (left+ right)/2;
            if(target < letters[mid]){
                right = mid-1;

            }
            else{
                left = mid+ 1;
            }
        }
        return letters[left % letters.length];
        
    }
}