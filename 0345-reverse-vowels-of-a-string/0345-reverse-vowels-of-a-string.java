class Solution {
    public String reverseVowels(String s) {
        HashSet<Character> vowels = new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        char[] c = s.toCharArray();
        int lptr = 0;
        int rptr = s.length() -1 ;
        while(lptr<= rptr){
            if( vowels.contains(c[lptr]) && vowels.contains(c[rptr])){
                char temp = c[lptr];
                c[lptr] = c[rptr];
                c[rptr] = temp;
                lptr +=1;
                rptr -=1;

            }
            else if(vowels.contains(c[lptr])){
                rptr -=1;
            }
            else if(vowels.contains(c[rptr])){
                lptr +=1;
            }
            else{
                rptr -=1;
                lptr +=1;
            }

        }
        return new String(c);
    }
}