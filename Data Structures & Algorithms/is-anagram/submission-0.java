class Solution {
    public boolean isAnagram(String s, String t) {
        char[] w1 =t.toCharArray();
        Arrays.sort(w1);
        char[] w2 =s.toCharArray();
        Arrays.sort(w2);
        return Arrays.equals(w1,w2);
    }
}
