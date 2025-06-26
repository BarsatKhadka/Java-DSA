class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String t : tokens){
            if(t.equals("+")){
                stack.push(stack.pop() + stack.pop());
            }
            else if(t.equals("-")){
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b-a);
            }
            else if(t.equals("*")){
                stack.push(stack.pop() * stack.pop());
            }
            else if(t.equals("/")){
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b/a);
            }
            else{
                int a = Integer.parseInt(t);
                stack.push(a);
            }
        }

        return stack.peek();
        
    }
}