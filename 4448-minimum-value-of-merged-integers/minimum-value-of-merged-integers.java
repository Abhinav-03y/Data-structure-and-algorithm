class Solution {
    public int minMergedInteger(int[] nums){
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < nums.length; i += 2){
            int b = nums[i + 1];
            int temp = b;

            while(temp > 0){
                nums[i] *= 10;
                temp /= 10;
            }
            int merged =nums[i] +b ;
            min = Math.min(min , merged );
        }
        return min;
    }
}