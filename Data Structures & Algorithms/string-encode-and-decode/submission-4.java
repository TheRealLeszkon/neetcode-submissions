class Solution {

    public String encode(List<String> strs) {
        return strs.stream().reduce((str,e)->str+";"+e).orElse(null);
    }

    public List<String> decode(String str) {
        if(str==null) return new ArrayList<>();
        return new ArrayList<>(List.of(str.split(";")));
    }
}
