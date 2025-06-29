class Solution {
public:
    bool isPalindrome(int x) {
        if (x < 0)  return false;

        int temp = x;
        unsigned int rev = 0;

        while (temp != 0) {
            int units = temp % 10;
            rev = rev * 10 + units;
            temp /= 10;
        }
        
        return x == rev;
    }
};