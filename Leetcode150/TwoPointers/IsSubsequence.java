package Leetcode150.TwoPointers;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
        while (i < s.length()) {
            if (j >= t.length()) return false;
            if (s.charAt(i) == t.charAt(j++)) i++;
        }
        return true;
    }
}
