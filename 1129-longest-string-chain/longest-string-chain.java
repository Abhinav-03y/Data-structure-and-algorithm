class Solution {

int [] dp = new int[1001];
    int fun(String[] words, int i) {

        if (i >= words.length) {
            return 0;
        }
        if(dp[i] !=-1 )
        return dp[i];

        int ans = 1;

        for (int j = 0; j < i; j++) {

            if (words[j].length() + 1 == words[i].length()
                    && check(words[j], words[i])) {

                ans = Math.max(ans, 1 + fun(words, j));
            }
        }

        return dp[i]= ans;
    }
   
    boolean check(String a, String b) {

        int i = 0;
        int  j = 0;
        while(i < a.length() && j <b.length()){
            if(a.charAt(i) == b.charAt(j)){
                i++;
            }
            j++;
        }
        return i == a.length();

    }
    public int longestStrChain(String[] words) {
        Arrays.sort(words, (a, b) -> a.length() - b.length());

        Arrays.fill(dp , -1);


        int ans = 0;

        for (int i = 0; i < words.length; i++) {
            ans = Math.max(ans, fun(words, i));
        }

        return ans;
    }
}