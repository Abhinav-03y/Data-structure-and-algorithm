class Solution {
int dp[];

     int fun(int i ,int[] arr,int end){
        if(i > end){
            return 0;
        }
        if(dp[i] != -1){
            return dp[i];
        }

            int c1= arr[i] +fun(i+2,arr,end);
             int c2 = fun(i + 1,arr,end);

              dp[i] = Math.max(c1, c2);

        return dp[i];
        }
     
    public int rob(int[] nums) {
        int n = nums.length;
           if (n == 1) {
            return nums[0];
        }
          dp = new int[n];
        java.util.Arrays.fill(dp, -1);

        int c1 = fun(0, nums, n-2);
        java.util.Arrays.fill(dp, -1);

        int c2 = fun(1,nums, n-1);

        return Math.max(c1, c2);
        
    }
}