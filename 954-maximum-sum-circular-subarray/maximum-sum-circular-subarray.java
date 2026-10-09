class Solution {
    int[] dp;

    int fun(int[] nums, int i) {
        if (i == 0) {
            return nums[0];
        }

        if (dp[i] != -1) {
            return dp[i];
        }

        return dp[i] = Math.max(nums[i], fun(nums, i - 1) + nums[i]);
    }

    public int maxSubarraySumCircular(int[] nums) {
        int n = nums.length;
        dp = new int[n];
        Arrays.fill(dp, -1);

        int maxSum = Integer.MIN_VALUE;
        int total = 0;

        for (int i = 0; i < n; i++) {
            maxSum = Math.max(maxSum, fun(nums, i));
            total += nums[i];
        }

        int minSum = Integer.MAX_VALUE;
        int curMin = 0;

        for (int x : nums) {
            curMin = Math.min(x, curMin + x);
            minSum = Math.min(minSum, curMin);
        }

        if (maxSum < 0) {
            return maxSum;
        }

        return Math.max(maxSum, total - minSum);
    }
}