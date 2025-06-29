public class lc0058 {
    public int lengthOfLastWord(String s) {
        if (s.length() == 1 && Character.isLetter(s.charAt(0))) {
            return 1;
        }

        int i = s.length() - 1;
        int count = 0;
        boolean hasCountStarted = false;
        while (i >= 0) {
            if (Character.isLetter(s.charAt(i))) {
                count++;
                hasCountStarted = true;
                i--;
            } else if (!hasCountStarted && s.charAt(i) == ' ') {
                i--;
            } else if (hasCountStarted && s.charAt(i) == ' ') {
                break;
            }
        }
        return count;
    }
}
