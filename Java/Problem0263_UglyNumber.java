/*
    An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.

    Given an integer n, return true if n is an ugly number.
 */

public class Problem0263_UglyNumber {
    public boolean isUgly(int n) {
        if (n <= 0)     return false;
        while (n > 1) {
            if      (n % 2 == 0)    n /= 2;
            else if (n % 3 == 0)    n /= 3;
            else if (n % 5 == 0)    n /= 5;
            else                    break;
        }
        return n == 1;
    }
}
