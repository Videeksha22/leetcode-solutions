class Solution {
    public int largestMagicSquare(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int side = Math.min(m, n);
        while(side > 0){
            for(int i=0; i<m; i++){
                for(int j=0; j<n; j++){
                    if(i+side<=m && j+side<=n){
                        if(isValid(grid,m,n,i,j,side))
                            return side;
                    }
                }
            }
            side--;
        }
        return 0;
    }

    private boolean isValid(int[][] grid, int m, int n, int i, int j, int side) {
        int sum = 0;
        for (int x=i; x < i + side; x++) {
            int sum2 = 0;
            for (int y=j; y < j + side; y++)
                sum2 += grid[x][y];
            if (x == i) 
                sum = sum2;
            else if (sum != sum2) 
                return false;
        }

        for (int x=j; x < j + side; x++) {
            int sum2 = 0;
            for (int y=i; y < i + side; y++) {
                sum2 += grid[y][x];
            }
            if (sum != sum2) 
                return false;
        }
        int sum2 = 0;
        for (int k = 0; k < side; k++)
            sum2 += grid[i + k][j + k];
        if (sum != sum2) 
            return false;
        sum2=0;
        for (int k=0; k<side; k++)
            sum2 += grid[i + k][j + side - 1 - k];
        if (sum != sum2) 
            return false;
        return true;
    }

}