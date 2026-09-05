class Solution {
int [][]dp;

     int fun(int i ,int[] arr,int f){
         if (i >= arr.length) {
            return 0;
        }
     
        if (i == arr.length - 1) {
            if (f == 1) {
                return 0;
            }
            return arr[i];
        }
         
       if(dp[i][f] != -1) return dp[i][f];

        int nf =f;

        if(i==0){
            nf=1;
        }

            int rob= arr[i] +fun(i+2,arr,nf);
             int n_rob = fun(i + 1,arr,f);

              dp[i][f] = Math.max(rob,n_rob);

        return dp[i][f];
        }
     
    public int rob(int[] nums) {
     int n = nums.length;

        if (n == 1) return nums[0];

        dp = new int[n][2];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return fun(0, nums, 0);
        
    }
}