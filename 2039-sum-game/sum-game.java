class Solution {
    public boolean sumGame(String num) {
      int n = num.length();
        int mid =n/2;

        int sum1 =0;
        int sum2 =0;
        int q1=0;
        int q2 =0;

        for(int i=0;i<mid;i++){
            if(num.charAt(i) == '?'){
                q1++;
            }else{
                sum1 += num.charAt(i)-'0';
            }
        }
        for(int i=mid ; i<n ; i++){
            if(num.charAt(i) == '?'){
                q2++;
            }else{
                sum2 += num.charAt(i)-'0';
            }
        }
        int diff =sum1 -sum2;
        int qdiff =q2 -q1;
      return 2*diff != 9*qdiff;
    }
}