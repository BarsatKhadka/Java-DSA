class MinStack {
    Stack<Integer> stack1;
    Stack<Integer> minStack;

    public MinStack() {
        stack1 = new Stack<>();
        minStack = new Stack<>();

        
    }
    
    public void push(int val) {
        if(minStack.isEmpty() || val <= minStack.peek()){
            minStack.push(val);
        }
        stack1.push(val);
        
    }
    
    public void pop() {
        int top = stack1.pop();
        if(top == minStack.peek()){
            minStack.pop();
        }
        
    }
    
    public int top() {
        return stack1.peek();

        
    }
    
    public int getMin() {
        return minStack.peek();
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */