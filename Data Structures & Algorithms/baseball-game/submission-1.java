class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        String op;
        int sum =0;
        for(int i=0;i<operations.length;i++){
            op =operations[i];
            if(op.equals("+")){
                int lastValue = stack.pop();
                int nextValue =stack.peek()+lastValue;
                stack.push(lastValue);
                stack.push(nextValue);
                sum+=stack.peek();
            }else if(op.equals("C")){
                sum-=stack.pop();
            }else if(op.equals("D")){
                stack.push(stack.peek()*2);
                sum+=stack.peek();
            }else{
                stack.push(Integer.parseInt(op));
                sum+=stack.peek();
            }
            
        }
        
        return sum;
    }
}