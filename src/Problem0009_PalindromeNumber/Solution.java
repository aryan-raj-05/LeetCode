package Problem0009_PalindromeNumber;

public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        if (x == 0)
            return true;

        int temp = x;
        int rev = 0;
        while (temp != 0) {
            int n = temp % 10;
            rev = rev * 10 + n;
            temp = temp / 10;
        }

        return x == rev;
    }
}
