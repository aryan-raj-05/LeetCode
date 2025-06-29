public class lc0067 {
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

class Solution_2 {
    public String addBinary(String a, String b) {
        StringBuilder res = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while(i >= 0 || j >= 0){
            int sum = carry;
            if(i >= 0) sum += a.charAt(i--) - '0';
            if(j >= 0) sum += b.charAt(j--) - '0';
            carry = sum > 1 ? 1 : 0;
            res.append(sum % 2);
        }

        if(carry != 0) res.append(carry);
        return res.reverse().toString();
    }
}
