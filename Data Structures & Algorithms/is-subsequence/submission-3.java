class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0) return true;
        if(t.length()==0) return false;
        int curr =0;
        for(int i=0;i<t.length();i++){
            if(curr==s.length()){
                break;
            }
            if(t.charAt(i) == s.charAt(curr)){
                curr++;
            }
        }
        return curr==s.length();

    }
}