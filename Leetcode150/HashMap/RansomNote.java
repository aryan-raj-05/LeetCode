package Leetcode150.HashMap;

// Problem 383: Ransom Note

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] memo = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            memo[magazine.charAt(i) - 'a']++;
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            memo[ransomNote.charAt(i) - 'a']--;
        }

        for (int i = 0; i < memo.length; i++) {
            if (memo[i] < 0) return false;
        }
        return true;
    }
}
