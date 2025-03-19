public class Problem0007_ReverseInteger {
    public int reverse(int x) {
        if (x == 0 || x == Integer.MAX_VALUE || x == Integer.MIN_VALUE)     return 0;
        int sign = (x > 0) ? 1: -1;
        x = (x < 0) ? -x : x;
        int res = 0;
        while (x != 0) {
            int units = x % 10;
            if (res > Integer.MAX_VALUE / 10 || res == Integer.MAX_VALUE / 10 && units > 7)
                return 0;
            res = res * 10 + units;
            x /= 10;
        }
        return sign * res;
    }
}
