package Problem0067_AddBinary;

public class Solution {
    public String addBinary(String a, String b) {
        String res = "";

        // makes both string a and b of equal length
        // by padding the smaller one with zeros in front
        int size = Integer.max(a.length(), b.length());
        while(a.length() < size)
            a = '0' + a;
        while(b.length() < size)
            b = '0' + b;

        int i = size - 1, j = size - 1;
        int carry = 0;

        while (i >= 0 && j >= 0) {
            char digit = '0';
            int sum = (a.charAt(i) - '0') + (b.charAt(j) - '0') + carry;

            switch (sum) {
                case 0:
                    carry = 0;
                    break;
                case 1:
                    digit = '1';
                    carry = 0;
                    break;
                case 2:
                    carry = 1;
                    break;
                case 3:
                    digit = '1';
                    carry = 1;
                    break;
            }
            res = digit + res;
            i--;
            j--;
        }

        res = (carry == 1) ? ('1' + res) : res;
        return res;
    }
}
