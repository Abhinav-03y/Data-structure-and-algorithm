class Solution {
    public long maximizeSum(int[] nums, int k) {
         int n = nums.length;
        long sum = 0;
        long[] gains = new long[n];



        for (int i = 0; i < n; i++) {
            int num = nums[i];
            int[] freq = new int[10];

            while (num > 0) {
                freq[num % 10]++;

                
                num /= 10;
            }

            long rearranged = 0;

            for (int d = 9; d >= 0; d--) {
                while (freq[d] > 0) {
                    rearranged = rearranged * 10 + d;
                    freq[d]--;
                }
            }

            sum += nums[i];
            gains[i] = rearranged - nums[i];
        }

        Arrays.sort(gains);

        for (int i = n - 1; i >= n - k; i--) {
            sum += gains[i];
        }

        return sum;
    }
}