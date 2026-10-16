class Solution {
    int []dp;
    int fun(int i ,int []nums){
        int n=nums.length;
        if(i >=n-1){
            return 0;
        }
        if(dp[i] != -1)
        return dp[i];
        int ans=100000;
        for(int j=1; j <= nums[i];j++ ){
             if (i + j < n) {
                ans = Math.min(ans, 1 + fun(i + j, nums));
        }
     
    }
     return  dp[i] =ans;
    }
    public int jump(int[] nums) {
        dp =new int[nums.length];
        for(int i=0 ;i<1001; i++){
            Arrays.fill(dp, -1);
        }
         return fun(0,nums);
    }
}