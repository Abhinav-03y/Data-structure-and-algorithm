class Solution {
    public boolean validPalindrome(String s) {
        int left=0;
        int right=s.length()-1;
         while(left<right){
            if(s.charAt(right)!=s.charAt(left)){
        return checkp(s, left+1, right)||checkp(s,left,right-1);
            }
            left++;
            right--;
    }
    return true;
    }
        public boolean checkp(String s, int left, int right){
        while(left<right){
            if(s.charAt(right)!=s.charAt(left)){
                return false;
            }
            left++;
            right--;
        }
        // int flag2=0;
        // int left1=0;
        // int right1=s.length()-1;
        // while(left1<right1){
        //     if(s.charAt(left1)==s.charAt(right1)){
        //         flag2++;
        //     }
        //     left1++;
        //     right1--;
        // }
        // if(flag2==s.length()-1){
        //     return true;
        // }

        return true;
    }
}