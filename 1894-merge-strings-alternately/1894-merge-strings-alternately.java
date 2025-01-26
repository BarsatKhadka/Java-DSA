class Solution {
    public String mergeAlternately(String word1, String word2) {
        int smallerLength = word1.length();
        if(word2.length() < smallerLength){
            smallerLength = word2.length();
        }

        String result = "";
        for(int i=0; i<smallerLength; i++){
            result+= word1.charAt(i);
            result+= word2.charAt(i);
        }


        if(word1.length() > word2.length()){
            int lengthDiff = word1.length() - word2.length();
            String appendItem = word1.substring(word1.length() - lengthDiff);
            return result + appendItem;

        }
        else if(word2.length() > word1.length()){
            int lengthDiff2 = word2.length() - word1.length();
            String appendItem = word2.substring(word2.length() - lengthDiff2);
            return result + appendItem;

        }


        return result;




        
    }
}