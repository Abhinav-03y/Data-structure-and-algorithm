class Solution {

    int[][] dp = new int[1001][1001];

    int fun(int i, int j, String s, String t) {

        if(i >= s.length() || j >= t.length()) {
            return 0;
        }

        if(dp[i][j] != -1) {
            return dp[i][j];
        }

        int max = 0;

        if(s.charAt(i) == t.charAt(j)) {

            int a = 1 + fun(i + 1, j + 1, s, t);
            max = Math.max(max, a);

        } else {

            int b = fun(i + 1, j, s, t);
            int c = fun(i, j + 1, s, t);

            max = Math.max(max, b);
            max = Math.max(max, c);
        }

        return dp[i][j] = max;
    }

    public int longestPalindromeSubseq(String s) {

        String t = "";

        for(int i = s.length() - 1; i >= 0; i--) {
            t = t + s.charAt(i);
        }

        for(int i = 0; i <= 1000; i++) {
            Arrays.fill(dp[i], -1);
        }

        return fun(0, 0, s, t);
    }
}