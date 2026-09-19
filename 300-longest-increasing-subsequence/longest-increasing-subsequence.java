class Solution {
    public int lengthOfLIS(int[] nums) {

        
         int[][] v1 = new int[nums.length][2];

        int size = 0;
        int i = 0;

        for (int a : nums) {
            if (size == 0 || a > v1[size - 1][0]) {


                v1[size][0] = a;

                v1[size][1] = i;
                size++;
            } 
            else {

                int j = 0;

                while (j < size) {

                    if (v1[j][0] >= a) {

                        if (i > v1[j][1]) {

                            v1[j][0] = a;
                            v1[j][1] = i;
                        }

                        break;
                    }

                    j++;
                }
            }

            i++;
        }

        return size;
    }
}