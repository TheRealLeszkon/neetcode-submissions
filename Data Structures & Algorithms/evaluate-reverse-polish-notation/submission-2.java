class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack =new Stack<>();
        for(String operand : tokens){
            if(operand.equals("+")){
                stack.add(stack.pop()+stack.pop());
            }else if(operand.equals("-")){
                int sub = stack.pop();
                stack.add(stack.pop()-sub);
            }else if(operand.equals("/")){
                int denominator = stack.pop();
                stack.add(stack.pop()/denominator);
            }else if(operand.equals("*")){
                    stack.push(stack.pop()*stack.pop());
            }else{
                stack.push(Integer.parseInt(operand));
            }
        }
        return stack.pop();
    }
}
