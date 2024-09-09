package questions;

public class ConvertToSigned32BitInteger {

    public int convert(String s) {
        int sign = 1;
        int i = 0;
        long result = 0;
        StringBuilder resString = new StringBuilder();

        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }

        if (s.charAt(i) == '-') {
            sign = -1;
            i++;
        } else if (s.charAt(i) == '+') {
            return i++;
        }

        while (i < s.length() && s.charAt(i) == '0') {
            i++;
        }

        while (i < s.length()) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                result = result * 10 + (s.charAt(i) - '0');
                long tempRes = result * sign;
                if (tempRes > Integer.MAX_VALUE)
                    return Integer.MAX_VALUE;
                else if (tempRes < Integer.MIN_VALUE)
                    return Integer.MIN_VALUE;
            } else {
                return (int) result * sign;
            }
            i++;
        }
        return (int) (result * sign);
    }
}
