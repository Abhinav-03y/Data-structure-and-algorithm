class Solution {
    void fun(int i,String s, String[] m1, String temp,List<String> ans){
      
        if (i == s.length()) {
            ans.add(temp);
            return;
        }
        int curr = s.charAt(i) - '0';

        String str = m1[curr];

        for(int j = 0; j < str.length(); j++) {
            temp += str.charAt(j);

            fun(i+1, s, m1,temp ,ans);

            temp = temp.substring(0, temp.length() - 1);

          
        }
    }

    public List<String> letterCombinations(String digits) {

        List<String> ans =new ArrayList<>();
        if (digits.length() == 0) {
            return ans;
        }

        String[] m1 = {
            "", "", "abc", "def",
            "ghi", "jkl", "mno",
            "pqrs", "tuv", "wxyz"
        };

        fun(0, digits, m1, "", ans);

        return ans;
    }
}