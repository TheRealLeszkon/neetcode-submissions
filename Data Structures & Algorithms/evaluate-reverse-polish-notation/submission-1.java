class Solution {
    public int evalRPN(String[] input) {
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<input.length;i++){
            int result;
            System.out.println("Element evaled -> "+ input[i]);
            switch (input[i]){
                case "+":{
                    stack.push(stack.pop()+stack.pop());
                    break;
                }
                case "-":{
                    int temp =stack.pop();
                    stack.push(stack.pop()-temp);
                    break;
                }
                case "*":{
                    stack.push(stack.pop()*stack.pop());
                    break;
                }
                case "/":{
                    int temp =stack.pop();
                    stack.push(stack.pop()/temp);
                    break;
                }
                default:{
                    stack.push(Integer.valueOf(input[i]));
                }
            }
        }
        return stack.pop();
    }
}
