
class Solution {

    int [][][] dp = new int[51][51][51];
    int fun(int r1, int c1, int r2, int[][] grid) {
        int n = grid.length;
        int c2 = r1 + c1 - r2;

        if (r1 >= n || r2 >= n || c1 >= n || c2 >= n)
            return -1000000;

        if (grid[r1][c1] == -1 || grid[r2][c2] == -1)
            return -1000000;

        if (r1 == n - 1 && c1 == n - 1)
            return grid[r1][c1];
            if(dp[r1][c1][r2]  != -1)
            return dp[r1][c1][r2];

        int a = fun(r1 + 1, c1, r2 + 1, grid);
        int b = fun(r1 + 1, c1, r2, grid);
        int c = fun(r1, c1 + 1, r2 + 1, grid);
        int d = fun(r1, c1 + 1, r2, grid);

        int cherries = grid[r1][c1];

        if (r1 != r2 || c1 != c2)
            cherries += grid[r2][c2];

        return  dp[r1][c1][r2] =cherries + Math.max(Math.max(a, b), Math.max(c, d));
    }

    public int cherryPickup(int[][] grid) {

        for(int i=0 ; i <51;i++){
            for (int j = 0; j < 51; j++) {
            Arrays.fill(dp[i][j] , -1);
        }
        }
        return Math.max(0, fun(0, 0, 0, grid));
    }
}
