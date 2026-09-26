class Solution {
    int [][] dp;
    int fun(int[][] pairs,int i ,int prev){
        if(i >= pairs.length){
            return 0;
        }
        if(dp[i][prev+1] != -1){
            return dp[i][prev+1];
        }



        int max =0;

        if(prev == -1 || pairs[i][0] > pairs[prev][1]){
            int a = 1+fun(pairs, i+1 ,i);

            max =Math.max(max, a);
        }
          int b = fun(pairs, i + 1, prev);
          max = Math.max(max,b);

          return dp[i][prev+1] =max;

    }
    public int findLongestChain(int[][] pairs) {
        int n = pairs.length;
        
        Arrays.sort(pairs, (a, b) -> a[0] - b[0]);
        dp = new int[n][n + 1];

        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }
        return fun(pairs , 0 ,-1);
        
    }
}