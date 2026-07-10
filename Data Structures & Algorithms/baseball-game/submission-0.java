class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        String op;
        for(int i=0;i<operations.length;i++){
            op =operations[i];
            if(op.equals("+")){
                int lastValue = stack.pop();
                int nextValue =stack.peek()+lastValue;
                stack.push(lastValue);
                stack.push(nextValue);
                
            }else if(op.equals("C")){
                stack.pop();
            }else if(op.equals("D")){
                stack.push(stack.peek()*2);
                
            }else{
                stack.push(Integer.parseInt(op));
                
            }
        }
        System.out.println(stack);
        int sum =0;
        while(!stack.isEmpty()){
            sum+=stack.pop();
        }
        return sum;
    }
}