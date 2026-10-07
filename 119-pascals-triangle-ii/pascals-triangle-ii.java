class Solution {
    int [][] dp = new int[34][34];
    int fun(int row , int col){
        if(col ==0 || col == row){
            return 1;
        }
        if(dp[row][col] != -1){
            return dp[row][col];
        }
        return dp[row][col]=fun(row -1,col -1) + fun(row-1 , col);
    }
    public List<Integer> getRow(int rowIndex) {

        List<Integer> ans = new ArrayList<>();

        for(int i=0 ;i <34; i++){
            Arrays.fill(dp[i], -1);
        }

        for(int j =0 ; j <= rowIndex ;j++){
          ans.add(fun(rowIndex , j));
        }
        return ans;
    }
}