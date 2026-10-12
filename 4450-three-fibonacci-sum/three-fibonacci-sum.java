class Solution {
    int [] dp;

   int  fun(int n){

     if(n == 0 || n==1)
        return n;

       if(dp[n] != -1)
       return dp[n];
       

        return dp[n]= fun(n-1) + fun(n-2) ;
            }
    public boolean threeFibonacciSum(int n) {

        dp = new int[50];
            Arrays.fill(dp ,-1);
      for(int i=0;i<45 ;i++){
          int a =fun (i);
          int b= fun(i+1);
          int c =fun(i+2);

          if(a+b+c == n)
          return true;

          if(a+b+c > n)
          return false; 
      }
        return false;
    }
}