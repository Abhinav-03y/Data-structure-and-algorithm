class Solution {
    public int minPathSum(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int [] prev =new int[n];
        int [] curr =new int[m];

        for(int i =0 ; i <n ;i++){
           for(int j =0 ; j<m ; j++){
            if(i==0 && j == 0){
                curr[j] =grid[i][j];
            }else if(i ==0){
                 curr[j]  = grid[i][j] + curr[j-1];
            }else if(j== 0){
                curr[j] = grid[i][j] + prev[j];
            }else{
                    curr[j] = grid[i][j] + Math.min(curr[j - 1], prev[j]);
                }
            }
            prev = curr;
        }
        return prev[m - 1];
    }
}