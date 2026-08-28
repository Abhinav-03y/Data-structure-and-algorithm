class Solution {
    public boolean sumGame(String s) {

        double res = 0;
        double n = s.length();

        for (int i = 0; i < n; i++) {

            double sign;

            if (i < n / 2) {
                sign = 1;
            } else {
                sign = -1;
            }

            double value;

            if (s.charAt(i) == '?') {
                value = 4.5;
            } else {
                value = s.charAt(i) - '0';
            }

            res += sign * value;
        }

        if (res != 0.0) {
            return true;
        } else {
            return false;
        }
    }
}