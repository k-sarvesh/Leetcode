
class Solution {
    public int myAtoi(String s) {
        int n = s.length();
        int i = 0;

        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        int sign = 1;

        if (i < n && s.charAt(i) == '-') {
            sign = -1;
            i++;
        } else if (i < n && s.charAt(i) == '+') {
            i++;
        }

        return convert(s, i, sign, 0);
    }

    static int convert(String s, int i, int sign, int num) {

        if (i == s.length() ||
            s.charAt(i) < '0' || s.charAt(i) > '9') {
            return sign * num;
        }

        int ch = s.charAt(i) - '0';

        if (num > Integer.MAX_VALUE / 10 ||
            (num == Integer.MAX_VALUE / 10 && ch > 7)) {
            return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }

        int newNum = num * 10 + ch;

        return convert(s, i + 1, sign, newNum);
    }
}