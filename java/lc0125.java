public class lc0125 {
    public boolean isPalindrome(String s) {
        if (s.isEmpty())
            return true;

        int i = 0, j = s.length() - 1;
        while (i < j) {
            char x = s.charAt(i);
            char y = s.charAt(j);

            if (!Character.isLetterOrDigit(x))
                i++;
            else if (!Character.isLetterOrDigit(y))
                j--;
            else {
                if (Character.toLowerCase(x) == Character.toLowerCase(y)) {
                    i++; j--;
                } else
                    return false;
            }
        }
        return true;
    }
}
