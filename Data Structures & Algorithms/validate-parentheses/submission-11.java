class Solution {
    public boolean isValid(String s) {
        if(s.length()%2!=0){
            return false;
        }
        Map<Character,Character> map = Map.of(
            '}', '{',
            ')', '(',
            ']','['
        );
        Stack<Character> stack = new Stack<>();
        
        for(int i =0 ;i<s.length();i++){
            char c = s.charAt(i);
            if(map.containsValue(c)){
                stack.push(c);
            }else if(stack.isEmpty() || stack.pop() != map.get(c)){
                    return false;
            }    
        }

        return stack.isEmpty();
    }
}
