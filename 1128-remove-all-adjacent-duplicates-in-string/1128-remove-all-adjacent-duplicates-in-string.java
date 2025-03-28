class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder res = new StringBuilder();

        for(int i=0; i<s.length(); i++){
            if(!stack.isEmpty() && stack.peek().equals(s.charAt(i))){
                stack.pop();
            }
            else{
                stack.push(s.charAt(i));
            }
        }

        for(Character c: stack){
            res.append(c);
        }
        return res.toString();

        

        
        
    }
}