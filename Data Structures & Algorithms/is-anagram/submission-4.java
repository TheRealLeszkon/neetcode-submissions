class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> word1 = new HashMap<>();
        Map<Character,Integer> word2 = new HashMap<>();
        if(s.length()!=t.length())
            return false;
        for(int i=0;i<t.length();i++){
               word1.put(t.charAt(i),(1+word1.getOrDefault(t.charAt(i),0)));
            word2.put(s.charAt(i),(1+word2.getOrDefault(s.charAt(i),0)));
        }
        return word1.equals(word2);
    }
}
