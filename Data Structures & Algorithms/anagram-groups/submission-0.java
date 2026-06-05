class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String ,List<String>> map = new HashMap<>();

        for(String str : strs){
            char[] keyArr = str.toCharArray();
            Arrays.sort(keyArr);
            System.out.println(Arrays.toString(keyArr));
            String key =new String(keyArr);
            if(map.putIfAbsent(key,new ArrayList<>(List.of(str)))!=null){
                List<String> lst =map.get(key);
                lst.add(str);
            }
        }
        List<List<String>> result = new ArrayList<>(map.values());
        return result;
    }
}
