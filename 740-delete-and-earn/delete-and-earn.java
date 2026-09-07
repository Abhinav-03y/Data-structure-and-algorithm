class Solution {
    int[] dp = new int[20005];
    int fun(int i,int [] arr,HashMap<Integer,Integer>m1){
        int n =arr.length;

      
        if(i>=n) return 0;

        if(dp[i]!=-1) return dp[i];
        int m=0;

         if (i == n - 1) {
            int a = arr[i] * m1.get(arr[i]);
            return dp[i] = a;
        }


        if(i+1<n && arr[i+1] == arr[i]+1){
        int a=(arr[i]*m1.get(arr[i]))+fun(i+2,arr,m1);
        m=Math.max(m,a);
        }

        if(i+1 < n && arr[i+1] != arr[i]+1){
        int a=(arr[i]*m1.get(arr[i]))+fun(i+1,arr,m1);
        m=Math.max(m,a);
        }

         int a=fun(i+1,arr,m1);
         m=Math.max(m,a);

       return dp[i]=m;


    }
    public int deleteAndEarn(int[] nums) {
       HashMap<Integer, Integer> m1 = new HashMap<>();
       for(int a:nums) 
       m1.put(a, m1.getOrDefault(a,0)+1);

       int [] v1= new int[m1.size()];
       int k=0;
       for(int a:m1.keySet()){
        v1[k++] = a;
       }
           Arrays.sort(v1);

        Arrays.fill(dp, -1);

        return fun(0, v1, m1);
    }
}