class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] s1Arr = new int[26];
        for(int i=0; i<s1.length(); i++){
            s1Arr[s1.charAt(i) - 'a'] ++;
        }
        
        for(int j=0; j<=s2.length()-s1.length(); j++){
            int[] s2Arr = new int[26];
            for(int k=0; k<s1.length(); k++){
                s2Arr[s2.charAt(k+j) - 'a']++;
            }
            if(matches(s2Arr, s1Arr)){
                return true;
            }
        }
        return false;
    }
    public boolean matches(int[] s2, int[] s1){
        for(int i=0; i<26; i++){
            if(s2[i] != s1[i]){
                return false;
            }
        }
        return true;
    }
}