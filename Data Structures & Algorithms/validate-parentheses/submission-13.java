class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character,Character> map = Map.of(
            '}','{',
            ')','(',
            ']','['
        );
        for(char c : s.toCharArray()){
            
            if(map.values().contains(c)){
                stack.push(c);
            }else if (map.keySet().contains(c)){
                if(stack.isEmpty()) return false;
                char top = stack.peek();
                if(map.get(c) != top) return false;
                stack.pop();
            }
            
        }
        return stack.isEmpty();
    }
}
