class Solution {
    public int countRotations(String s, int k) {
        int n = s.length();
        int sc=0;
        for(int  i=0;i<n-1 ;i++){
            if(s.charAt(i) == s.charAt(i+1)){
            sc++;
            }
            
        }
        int ans =0;
        for(int i=0; i<n ;i++){
         if(sc == k){
             ans++;
         }
            if(s.charAt(i)==s.charAt((i+1)%n)){
                sc--;
            }
            if(s.charAt((i+n-1)%n) == s.charAt(i)){
                sc++;
            }
            
        }
        return ans;
    }
}