class Solution {
    int []dp ;
    int fun(int[] nums,int i){
        if( i ==0){
            return nums[0];
        }
        if(dp[i] != -1)
        return dp[i];


        return dp[i]=Math.max(nums[i] ,fun(nums ,i -1) +nums[i]);
    }


    public int maxSubArray(int[] nums) {
        int n = nums.length;
        dp = new int[n];
        Arrays.fill(dp, -1);

        int ans = Integer.MIN_VALUE;


        for(int i=0 ;i<n ;i++){
            ans =Math.max(ans, fun(nums, i));
        }
     return ans;
    }
}