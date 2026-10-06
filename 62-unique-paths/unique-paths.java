class Solution {
    int [][]dp = new int[101][101];


    int fun(int i , int j ,  int n ,int m){
        if( i >=n || j >=m ){
            return 0;
        }
        if ( i == n-1 && j ==m -1){
            return 1;
        }
        if(dp[i][j] != -1){
        return dp[i][j];
    }

        int c1 = fun(i+1 ,j ,n,m);
        int c2 = fun( i ,j+1 ,n ,m);


        return dp[i][j] = c1 +c2;


    }



    public int uniquePaths(int m, int n) {

        for(int i =0 ; i <101 ;i++){
            Arrays.fill(dp[i],-1);
        }

        
        return fun( 0,0, n,m);
    }
}