class Solution {
    int[] dp = new int[1001];
    int fun(int[][] pairs,int i ){
        if(i >= pairs.length){
            return 0;
        }
        int id=pairs.length;

    if(dp[i]!=-1) return dp[i];

    //   for(int j=i+1;j<pairs.length;j++){
    //     if(pairs[j][0]>pairs[i][1]){
    //         id=j;
    //         break;
    //     }
    // }

    int low = i+1;
    int high =pairs.length -1;

    while(low <= high ){
        int mid =(low +high)/2;
        if(pairs[mid][0] > pairs[i][1]){
             id = mid;
             high =mid -1;

        }else{
            low = mid +1;
        }

    }



         int t=1+fun(pairs,id);
         int nt=fun(pairs,i+1);

       return dp[i]=Math.max(t,nt);

    }
    public int findLongestChain(int[][] pairs) {
   
        
        Arrays.sort(pairs, (a, b) -> a[0] - b[0]);
       

    
            Arrays.fill(dp, -1);
        
        return fun(pairs , 0 );
        
    }
}