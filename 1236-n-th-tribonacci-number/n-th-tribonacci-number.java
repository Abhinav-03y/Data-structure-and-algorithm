class Solution {
    public int tribonacci(int n) {
         int sum=0;
        if(n==1 || n==2)
        return 1;
        int a=0,b=0,c=1;
       
        while(n-- > 1){
                sum=a+b+c;
                a=b;
                b=c;
                c=sum;
            }
        return sum;
    }
}