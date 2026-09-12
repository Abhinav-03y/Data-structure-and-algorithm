import java.util.Arrays;
class Solution {
    int [][] dp =new int[501][501];
    int fun( int[] arr,int prev,int i,int max,int k){ 
        int n =arr.length;

        if(i  >= n)
        return 0;
        
        int ans =0;
        if(dp[i][prev]!=-1) return dp[i][prev];

        max = Math.max(max,arr[i]);
        int len =i-prev+1;

        if(len == k){
            int c1 =(max*len)+fun(arr, i+1 ,i+1,0,k);
            ans =Math.max(ans,c1);

        }
        else{
            int c1 =(max*len) + fun( arr, i+1, i+1 ,0 , k);
            int c2 =fun(arr ,prev ,i+1, max,k);
             ans =Math.max(ans,c1);
              ans =Math.max(ans,c2);

        }
        return dp[i][prev]=ans;
    }
    public int maxSumAfterPartitioning(int[] arr, int k) {
        for (int i = 0; i < 501; i++) 
        Arrays.fill(dp[i], -1);
        
        return fun(arr,0,0,0,k );
    }
}