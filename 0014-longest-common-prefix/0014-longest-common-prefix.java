class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String result = "";

        for(int i=0; i < Math.min(strs[0].length(), strs[strs.length-1].length()); i++){
            if(strs[0].charAt(i) == (strs[strs.length-1].charAt(i))){
                result += strs[0].charAt(i);
            }
            else{
                break;
            }


        }

        return result;



        
    }
}