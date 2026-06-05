class Solution {
    public boolean isValid(String s) {
        HashMap<Character,Character>  map = new HashMap<>();
        map.put(']','[');
        map.put('}','{');
        map.put(')','('); 
        int top = -1;
        char[] arr =s.toCharArray();
        for(int i=0;i<arr.length;i++ ){
            if(map.containsValue(arr[i])){
                arr[++top] = arr[i];
            } else if (map.containsKey(arr[i])) {
                if (top==-1) return false;
                else if(arr[top]!=map.get(arr[i])) return false;
                --top;
            }
        }
        return top==-1;
    }
}
