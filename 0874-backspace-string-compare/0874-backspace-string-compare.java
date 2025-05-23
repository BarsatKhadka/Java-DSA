class Solution {
    public boolean backspaceCompare(String s, String t) {
        return backspaced(s).equals(backspaced(t));

        
    }

    public static String backspaced(String s){
        Stack<Character> stack = new Stack<>();
        for(char c: s.toCharArray()){
            if(c != '#'){
                stack.push(c);
            }
            else if(!stack.isEmpty()){
                stack.pop();
            }
        }
        return String.valueOf(stack);
    }
}