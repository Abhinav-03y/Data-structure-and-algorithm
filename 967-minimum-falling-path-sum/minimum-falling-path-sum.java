class Solution {
    int [][]dp = new int[101][101];
    int fun(int i ,int j ,int [][] matrix){
        int n = matrix.length;

          if (j < 0 || j >= n)
            return (int) 1e9;

        if( i == n-1){
            return matrix[i][j];
        }

        if(dp[i][j] != Integer.MAX_VALUE)
        return dp[i][j];

        int c1 = fun(i +1 , j-1 ,matrix);
        int c2 = fun( i+1 ,j , matrix);
        int c3 = fun(i + 1 , j+1,matrix);

        return dp[i][j] =matrix[i][j] + Math.min(c1 ,Math.min(c2 ,c3));
    }


    public int minFallingPathSum(int[][] matrix) {

        int ans = (int)1e9;

        for(int i =0; i< 101 ;i++){
            Arrays.fill(dp[i] ,Integer.MAX_VALUE);
        }

        for(int j =0 ; j< matrix.length ;j++){
            ans = Math.min(ans, fun(0, j, matrix));
        }
        return ans;
    }
}