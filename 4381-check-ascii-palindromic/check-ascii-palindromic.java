class Solution {
    public boolean isPalindromic(String s) {
        int n = s.length();
     StringBuilder binary = new StringBuilder();

     for(int i=0;i<n ;i++){
        char c =s.charAt(i);

        int value =c;
        for(int bit =7;bit >=0;bit--){
            binary.append((value >> bit) & 1);
        }
     }
         int left =0;
         int right =  binary.length() -1;   

         while(left<right){
         if(binary.charAt(left) != binary.charAt(right)){
            return false;
         }
         left++;
         right--;

        }
        return true;
     
    }
}