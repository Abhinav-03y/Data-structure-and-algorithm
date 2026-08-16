class Solution {
    public int maxSubArray(int[] nums) {
         int cur = 0, max = -100000;

        for (int num: nums) {
            cur += num;

            if (cur > max)
                max = cur;

            if (cur < 0)
                cur = 0;
        }
        return max;
    }
}