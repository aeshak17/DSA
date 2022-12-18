public class NQueenProblem {
    public static void main(String args[])
    {

    }
    static boolean isSafe( int row, int col, char[][] board)
    {

        //horizontal check
        for(int j = 0; j<board.length; j++)
        {
            if(board[row][j] == 'Q')
                return false;
        }

        // vertical check
        for(int i=0;i<board[0].length; i++)
        {
            if(board[i][col] == 'Q')
            {
                return false;
            }

        }

        // check upper left and right and also lower left and lower right


        return true;
    }
}
