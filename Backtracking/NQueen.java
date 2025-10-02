class Solution {
    public ArrayList<ArrayList<Integer>> nQueen(int n) {
        // code here
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        ArrayList<Integer> a = new ArrayList<>();
        char[][] board = new char[n][n];
        printBoard(0,board,a,arr);
        return arr;
    }
    void printBoard(int row, char[][] board, ArrayList<Integer> a, ArrayList<ArrayList<Integer>> arr) {
       int n = board.length;
       if(row==n) //board taiyyar hai mark hokar if correct(note that in some cases it may not reach n in that case that board will not b printed
       {
           for(int i=0;i<n;i++)
           {
               for(int j=0;j<n;j++)
               {
                   if(board[i][j]=='Q') a.add(j+1);
               }
           }
           arr.add(new ArrayList<>(a));
           a.clear();
           return;
       }
       for(int col=0;col<n;col++)
       {
           if(canPlaceQueen(row,col,board))
           {
               board[row][col] = 'Q'; //mark
               printBoard(row+1,board,a,arr); //moving to the next row
               board[row][col] = '='; //unmark to find more ways(backtracking)
           }
       }
    }

    private static boolean canPlaceQueen(int row, int col, char[][] board) {
        int n = board.length;

        //checking for column
        int i = row-1;
        while(i>=0)
        {
            if(board[i][col]=='Q') return false;
            i--;
        }

        //checking for left diagonal
        i = row-1;
        int j = col-1;
        while(i>=0 && j>=0)
        {
            if(board[i][j]=='Q') return false;
            i--; j--;
        }

        //checking for right diagonal
        i = row-1;
        j = col+1;
        while(i>=0 && j<n)
        {
            if(board[i][j]=='Q') return false;
            i--; j++;
        }

        return true;
    }
}
