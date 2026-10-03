class Solution {
    int []dp;
    int fun (int n){
        if(n == 0){
            return 0;
        }

     if(dp[n] != -1){
        return dp[n];
     }

        return dp[n]=fun(n/2) +(n%2);
    }
    



    public int[] countBits(int n) {

        dp =new int[n+1];

          Arrays.fill(dp,-1);
          int[] ans = new int[n + 1];
         
        for(int i=0; i <=n ; i++){
             ans[i] = fun(i);
      
        }
          return ans;
    }
}