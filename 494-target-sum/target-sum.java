class Solution {
    private int fun(int[] nums ,int i , int target){

        if(i == 0){
            if(target - nums[0] == 0 ||
                target + nums[0] == 0 ){

                    if(nums[0] == 0 )
                    return 2;

                 return 1;   
                }
            return 0;
        }
        int pos = fun(nums , i - 1, target - nums[i]);

        int neg = fun(nums , i -1 ,target + nums[i]);

        return pos + neg;
    }
    public int findTargetSumWays(int[] nums, int target) {
        int n = nums.length;

        return fun(nums ,n -1 ,target);
        
    }
}