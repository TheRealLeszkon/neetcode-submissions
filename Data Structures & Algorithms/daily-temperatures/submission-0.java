class Solution {
    public int[] dailyTemperatures(int[] temps) {
        Stack<int[]> stack = new Stack<>();
        int[] result = new int[temps.length];
        for(int i=0;i<temps.length;i++){
            while(!stack.empty() &&temps[i] >stack.peek()[1]){
                int[] pair=stack.pop();
                result[pair[0]] = i-pair[0];
            }
            stack.push(new int[]{i,temps[i]});
        }
        return result;
    }
}
