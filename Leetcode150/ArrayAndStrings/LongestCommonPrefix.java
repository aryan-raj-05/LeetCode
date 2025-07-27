package Leetcode150.ArrayAndStrings;

public class LongestCommonPrefix {
    private String match(String s1, String s2) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < Integer.min(s1.length(), s2.length()); i++) {
            if (s1.charAt(i) == s2.charAt(i)) result.append(s1.charAt(i));
            else return result.toString();
        }
        return result.toString();
    }

    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() == 0) return "";
            prefix = match(prefix, strs[i]);
        }
        return prefix;
    }
}
