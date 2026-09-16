class Solution {
    int [][] dp = new int[1000][1000];
    int fun(int i,int j,String s){
        if(i>j)
        return 0;
        if(i ==j)
        return 1;

        if(dp[i][j] != -1)
        return dp[i][j];

        int max =0;
        if(s.charAt(i) == s.charAt(j)){
            int a = 2+fun(i+1,j-1,s);

            max = Math.max(max,a);
        }else{
            int b = fun(i+1,j,s);
            int c = fun(i,j-1,s);

            max = Math.max(max,b);

            max = Math.max(max,c);
        }
return dp[i][j] = max;
        

    }
    public int longestPalindromeSubseq(String s) {
        
        for(int i=0;i<1000;i++){
            Arrays.fill(dp[i],-1);
        }


        return fun(0, s.length() - 1, s);
        
    }
}