class MinStack {
    private Stack<Integer> stack = new Stack();
    int min = 0;

    public MinStack() {
        
    }
    public void push(int val) {

        
        stack.push(val);
        minCheck();
    }
    
    public void pop() {
        stack.pop();
        minCheck();
    }
    
    public void minCheck(){
        if(!stack.isEmpty()){
           Object[] arr = stack.toArray();
        
        Arrays.sort(arr);
        
        min = (int)arr[0]; 
        }     
    }
    
    public int top() {
        if(!stack.isEmpty()) return stack.peek();
        else return 0;
    }
    
    public int getMin() {
        minCheck();
        return min;
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
