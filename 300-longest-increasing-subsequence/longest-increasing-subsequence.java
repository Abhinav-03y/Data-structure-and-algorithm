class Solution {
    int [][] dp;
    int fun(int [] arr ,int i,int prev){
        if(i>= arr.length){
        return 0;
        }
         if (dp[i][prev + 1] != -1) {
            return dp[i][prev + 1];
         }
         int max =0;

        if( prev == -1 || arr[i] > arr[prev]){
            int a = 1 + fun( arr,i+1 ,i);

            max =Math.max(max, a);
        }
            int b = fun(arr,i+1 , prev);

            max = Math.max(max, b);
        
        return dp[i][prev +1] = max;
    }
    public int lengthOfLIS(int[] nums) {
          int n = nums.length;
        dp = new int[n][n + 1];

        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }
        return fun(nums , 0 ,-1);
        
    }
}