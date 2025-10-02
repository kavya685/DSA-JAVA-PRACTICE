class Solution {
    public ArrayList<String> ratInMaze(int[][] maze) {
        // code here
        int m = maze.length;
        int n = maze[0].length;
        ArrayList<String> arr = new ArrayList<>();
        boolean[][] visited = new boolean[m][n];
        paths(0,0,m-1,n-1,arr,visited,maze,"");
        Collections.sort(arr);
        return arr;
    }
    
    void paths(int r, int c, int er, int ec, ArrayList<String> arr, boolean[][] visited, int[][] maze, String s)
    {
        if(r>er || c>ec || c<0 || r<0 || visited[r][c]==true || maze[r][c]==0) return;
        
        visited[r][c] = true;
        
        if(r==er && c==ec)
        {
            arr.add(s);
            visited[r][c] = false;
            return;
        }
        
        paths(r,c-1,er,ec,arr,visited,maze,s+"L");
        paths(r-1,c,er,ec,arr,visited,maze,s+"U");
        paths(r,c+1,er,ec,arr,visited,maze,s+"R");
        paths(r+1,c,er,ec,arr,visited,maze,s+"D");
        
        visited[r][c] = false; //backtracking
    }
}
