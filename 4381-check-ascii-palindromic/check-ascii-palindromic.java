class Solution {
    public boolean isPalindromic(String s) {
        int n = s.length();
     StringBuilder binary = new StringBuilder();

     for(int i=0;i<n ;i++){
        char c =s.charAt(i);

        int value =c;
        for(int bit =7;bit >=0 ;bit--){
            binary.append((value >> bit) & 1);
        }
     }
         int L =0;
         int R =  binary.length() -1;   

         while(L < R){
         if(binary.charAt(L) != binary.charAt(R)){
            return false;
         }
         L++;
         R--;

        }
        return true;
     
    }
}