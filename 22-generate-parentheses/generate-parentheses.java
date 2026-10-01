class Solution {
     void fun(  String s,int a, int b, List<String> v1, int n) {
        

        if(a > n|| b> n ||b >a ){
            return;
        }
       

        if (s.length() == 2 * n) {
            v1.add(s);
            return;
        }
       fun( s +'(',a+1,b ,v1,n);
       fun( s +')',a,b+1 ,v1 ,n );
    }
 
    
    public List<String> generateParenthesis(int n) {
        List<String>  ans = new ArrayList<>();
          fun( "",0,0 ,ans,n);
          return ans;
    }
}