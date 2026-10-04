class Solution {
    int  fun( String s, int i , int curr){
        if(i>= s.length()){
            return 0;
        }
        int next = s.charAt(i) -'0';

        int diff =Math.abs(curr - next);
        int rot = Math.min(diff,10  - diff);

        return rot + fun(s , i+1 ,next);
       
    }  
    public int minRotations(String s) {
        return fun(s ,0 ,0);
    }
}