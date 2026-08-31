class Solution {
    public int minimumDeletions(int[] nums) {

        Map<Integer, Integer> m1 = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            m1.put(nums[i], i);
        }

        int mx = Integer.MIN_VALUE;
        int mn = Integer.MAX_VALUE;

        for (int num : nums) {
            mx = Math.max(mx, num);
            mn = Math.min(mn, num);
        }

        int x = m1.get(mx);
        int y = m1.get(mn);

        int n = nums.length;

        int M1 = Math.min(x, y);
        int m2 = Math.max(x, y);

        int a2 = Math.min(m2 + 1, n - M1);

        return Math.min( a2,
            Math.min(x + 1, n - x) +
            Math.min(y + 1, n - y)
        );
    }
}