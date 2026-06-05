class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Integer,HashSet<Character>> boxMap =new HashMap<>();
        for (int i=0;i<9;i++){
            HashSet<Character> colSet = new HashSet<>();
            HashSet<Character> rowSet = new HashSet<>();
            
            for (int j=0;j<9;j++){
                if('.'!=board[j][i]){
                    if (!colSet.add(board[j][i]))
                        return false;
                }
                if('.'!=board[i][j]){
                    if (!rowSet.add(board[i][j]))
                        return false;
                }
                if('.'!=board[i][j]){
                    int key = (i/3) *3+ (j/3);
                    boxMap.putIfAbsent(key,new HashSet<>());
                    if(!boxMap.get(key).add(board[i][j])){
                        return false;
                    }

                }
            }
        }
        return true;
        
    }
}
