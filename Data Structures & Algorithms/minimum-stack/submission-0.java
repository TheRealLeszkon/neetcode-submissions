class MinStack {
    private final List<Integer> stack;
    private final List<Integer> minStack;
    private int top =-1;
    public MinStack() {
        this.minStack = new ArrayList<>();
        this.stack=new ArrayList<>();
    }
    
    public void push(int val) {
       stack.add(val);
        if(minStack.isEmpty()){
            minStack.add(val);
            top++;
            return;
        }
        ++top;
        minStack.add(Math.min(stack.get(top),minStack.get(top-1)));
    }
    
    public void pop() {
        stack.remove(top);
        minStack.remove(top);
        top--;
    }
    
    public int top() {
        return stack.get(top);
    }
    
    public int getMin() {
        return minStack.get(top);
    }
}
