class Solution {
    public boolean canAliceWin(int n) {
       int res = 0;
        int i = 10;

        while (n > 0 && n >= i && i >= 1) {
            n = n - i;
            res = 1 - res;
            i--;
        }

        return (res == 1);
    }
}