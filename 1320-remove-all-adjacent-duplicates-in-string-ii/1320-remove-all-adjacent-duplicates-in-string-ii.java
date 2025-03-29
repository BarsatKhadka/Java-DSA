class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Character> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        for(char c: s.toCharArray()){
            if(!stack1.isEmpty() && stack1.peek() == c){
                stack2.push(stack2.peek() + 1);
            }
            else{
                stack2.push(1);
            }
            stack1.push(c);
            if(stack2.peek() == k){
                for(int i=0; i<k ; i++){
                    stack1.pop();
                    stack2.pop();
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for(char c: stack1){
            sb.append(c);
        }

        return sb.toString();
        
    }
}