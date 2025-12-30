class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        int r=grid.length, c=grid[0].length, ans=0;
        if (r < 3 || c < 3) 
            return 0;
        for (int i=0; i+2<r; i++) {
            for (int j=0; j+2<c; j++) {
                boolean[] box = new boolean[10];
                boolean res = true;
                for (int x=0; x<3 && res; x++) {
                    for (int y=0; y<3; y++) {
                        int v = grid[i + x][j + y];
                        if (v < 1 || v > 9 || box[v]) {
                            res = false;
                            break;
                        }
                        box[v] = true;
                    }
                }
                if (!res) 
                    continue;
                int s = grid[i][j] + grid[i][j+1] + grid[i][j+2];
                for (int x=0; x<3; x++)
                    if (grid[i+x][j] + grid[i+x][j+1] + grid[i+x][j+2] != s) 
                        res = false;
                for (int y = 0; y < 3; y++)
                    if (grid[i][j+y] + grid[i+1][j+y] + grid[i+2][j+y] != s) 
                        res = false;
                if (grid[i][j] + grid[i+1][j+1] + grid[i+2][j+2] != s)  
                    res = false;
                if (grid[i][j+2] + grid[i+1][j+1] + grid[i+2][j] != s) 
                    res = false;
                if(res) 
                    ans++;
            }
        }
        return ans;
    }
}