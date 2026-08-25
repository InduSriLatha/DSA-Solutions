class Solution {
    public boolean exist(char[][] board, String word) {
        
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[i].length;j++)
            {
                if(board[i][j]==word.charAt(0))
                    if(recursion(board, word, i, j,0))
                        return true;
            }
        }
        return false;
    }
    public boolean recursion(char[][] board, String word, int i, int j, int ind)
    {
        if(ind==word.length())  
            return true;
        if(i<0 || j<0 || i>=board.length || j>=board[0].length || board[i][j]!=word.charAt(ind))
            return false;
        if(board[i][j]==word.charAt(ind))
            ind++;
        
        char original = board[i][j];
        board[i][j]='#';
        boolean found = recursion(board, word, i-1, j, ind)|| recursion(board, word, i+1, j, ind) || recursion(board, word, i, j-1, ind) || recursion(board, word, i, j+1, ind);

        board[i][j]=original;
        return found;
    }
}