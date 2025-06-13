class Solution {
    public String longestCommonPrefix(String[] strs) {
        int minStrLen = Integer.MAX_VALUE;
        for(String i: strs){
            minStrLen = Math.min(minStrLen, i.length());
        }
        if(minStrLen == 0) return "";
        int commonUpToIndex = 0;
        for(int j = 0; j < minStrLen; j++){
            char common = strs[0].charAt(j);
            for(String s: strs){
            if(s.charAt(j) != common){
                return strs[0].substring(0,j);
            }
            }

        }

        return strs[0].substring(0,minStrLen);

        
    }
}