class Solution {
    public String reverseWords(String s) {
        String []sArr = s.trim().split("\\s+");
        for(int i =0 ; i < sArr.length/2 ;i++){
            String temp = sArr[i];
            sArr[i] = sArr[sArr.length -1 - i];
            sArr[sArr.length-1-i] = temp;
        }

        String result = String.join(" ", sArr);
        return result;
        

        
    }
}