class Solution {
    public boolean exist(char[][] board, String word) {
        char start = word.charAt(0);
        boolean ans =false;
        for(int i = 0;i<board.length;i++){
            for(int j = 0;j<board[0].length;j++){
                if(start ==  board[i][j]){
                        ans = fn(i,j,word,0,board);
                        if(ans) return true;
                }
            }
        }
        return false;
    }

    public boolean fn(int i ,int j,String word,int index,char[][] board){
            
            if(index == word.length()) return true;
            char w = word.charAt(index);


            if(i<0 || j<0 || i>=board.length || j >= board[0].length || board[i][j] != word.charAt(index)){
                return false;
            }
            char temp = board[i][j];
            board[i][j] = '#';
                        boolean found = fn(i-1,j,word,index+1,board) || fn(i+1,j,word,index+1,board) || fn(i,j-1,word,index+1,board) || fn(i,j+1,word,index+1,board) ;

        board[i][j] = temp;

        return found;
    }
}