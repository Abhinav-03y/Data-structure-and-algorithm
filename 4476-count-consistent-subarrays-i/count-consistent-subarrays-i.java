class Solution {
 int count =0;
    void fun(int[]nums,int i,int j,int and ,int min){
        int n = nums.length;

        if(j == n)
        return;

        and = and & nums[j];
        min  = Math.min(min,nums[j]);

        if(and == min)
        count++;

        fun(nums  , i ,j+1  ,and ,min);
        
    }
    public int countConsistent(int[] nums) {
   int n =nums.length;
        for(int i = 0; i < n ;i++){
            fun(nums , i , i, nums[i] ,nums[i]);
        }
        return count;
    }
}