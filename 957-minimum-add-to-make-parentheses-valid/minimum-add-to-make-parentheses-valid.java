class Solution {
    int fun(int i ,String s, int open){
        if(i == s.length())
        return open;

        char ch = s.charAt(i);


        if(ch == '('){
            return fun( i+1 ,s, open +1);
        }
        if(open > 0){
            return fun( i+1 ,s ,open -1);
        }
        return  1+ fun(i+1 ,s ,open);
    }



    public int minAddToMakeValid(String s) {
        return fun(0 ,s, 0);
        
    }
}