class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        if(grid[0][0]==1 || grid[n-1][m-1]==1)
            return -1;
        Queue<int[]> q=new LinkedList<>();
        q.add(new int[]{0,0,1});
        int dir[][]={{-1,-1},{-1,1},{1,-1},{1,1},{0,-1},{-1,0},{1,0},{0,1}};
        boolean visited[][]=new boolean[n][m];
        visited[0][0]=true;
        while(!q.isEmpty())
        {
            int cur[]=q.poll();
            int r=cur[0];
            int c=cur[1];
            int d=cur[2];

            if(r==n-1 && c==m-1)
                return d;
            for(int[] di:dir)
            {
                int nr=r+di[0];
                int nc=c+di[1];
                if(nr>=0 && nr<n && nc>=0 && nc<m && grid[nr][nc]==0 && !visited[nr][nc])
                {
                    q.offer(new int[]{nr,nc,d+1});
                    visited[nr][nc]=true;
                }
            }
        }
        return -1;
    }
}