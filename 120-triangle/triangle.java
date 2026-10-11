import java.util.*;

class Solution {
    int[][] dp;
    boolean[][] vis;

    int fun(int row, int col, List<List<Integer>> triangle) {
        if (row == triangle.size() - 1)
            return triangle.get(row).get(col);

        if (vis[row][col])
            return dp[row][col];

        int c1 = fun(row + 1, col, triangle);
        int c2 = fun(row + 1, col + 1, triangle);

        vis[row][col] = true;
        return dp[row][col] =
            triangle.get(row).get(col) + Math.min(c1, c2);
    }

    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        dp = new int[n][n];
        vis = new boolean[n][n];

        return fun(0, 0, triangle);
    }
}