class MinStack {
    private List<Integer>  stackList;
    private List<Integer> minList;
    private int top =-1;
    private int minimum;
    public MinStack() {
        stackList = new ArrayList();
        minList = new ArrayList();
        minimum = Integer.MAX_VALUE;
    }
    
    public void push(int val) {
        stackList.add(val);
        minimum = Math.min(val,minimum);
        minList.add(minimum);
        top++;
    }
    
    public void pop() {
        stackList.remove(top);
        minList.remove(top);
        --top;
        minimum = (top>=0)?minList.get(top):Integer.MAX_VALUE;
        
    }
    
    public int top() {
        return stackList.get(top);
    }
    
    public int getMin() {
        return minList.get(top);
    }
}
