class Solution {
    int fun(String s ) {
        int i=0;
        int j=s.length() -1;
          
          int cost =0;


          while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {

                int a1 = s.charAt(i) - 'a';
                int a2 = s.charAt(j) - 'a';

                int c1 = Math.abs(a1 - a2);
                int c2 = 26 -Math.abs(a1 - a2);

                cost += Math.min(c1, c2);
            }

            i++;
            j--;
          }
          return cost;
    }
    public int minOperations(String s) {
        int m=(int) 1e9;
        for(int i=0; i<s.length(); i++){
            int cost =fun(s) +i ;
            m =Math.min(m,cost);
            s = s.substring(1) +s.charAt(0);
            
            System.out.println(fun("abc"));
        }
           return m;  
         }
    }
