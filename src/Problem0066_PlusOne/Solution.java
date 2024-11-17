package Problem0066_PlusOne;

public class Solution {
    public int[] plusOne(int[] digits) {
        int[] sol = new int[digits.length];
        System.arraycopy(digits, 0, sol, 0, digits.length);

        int carry = 1;
        int i = digits.length - 1;
        while (carry != 0) {
            int sum = carry + digits[i];
            carry = (sum > 9) ? 1 : 0;
            sol[i] = sum % 10;
            i--;

            if (i < 0 && carry == 1) {
                int[] temp = new int[digits.length + 1];
                System.arraycopy(sol, 0, temp, 1, digits.length);
                temp[0] = 1;
                return temp;
            }
        }

        return sol;
    }
}
