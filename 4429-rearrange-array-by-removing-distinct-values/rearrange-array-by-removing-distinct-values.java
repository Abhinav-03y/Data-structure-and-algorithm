class Solution {

    int[] freq =new int[101];
    int[] ans ;
    int idx=0;


    void fun(int x){
        if( x > 100)
        return ;

        if(freq[x] > 0){
            ans[idx++] = x;
            freq[x]--;
        }
        fun(x+1);
    }
    public int[] rearrangeArray(int[] nums) {
        ans = new int[nums.length];

        for(int x: nums)
            freq[x]++;
        while(idx < nums.length)
        fun(1);
        
        return ans;
    }
}