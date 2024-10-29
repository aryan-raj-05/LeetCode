package Problem0013_RomantoInteger;

/*
    LeetCode Problem 13: Roman to Integer
    Given a Roman Numeral convert it into a valid integer

    Key Idea: iterate through the given string and when
              a number of low value is succeeded by a higher
              value number, then subtract current number from
              the result.
 */

import java.util.HashMap;

public class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> mp = new HashMap<>();
        mp.put('I', 1);
        mp.put('V', 5);
        mp.put('X', 10);
        mp.put('L', 50);
        mp.put('C', 100);
        mp.put('D', 500);
        mp.put('M', 1000);

        int ans = 0;
        int i = 0;
        while (i < s.length() - 1) {
            if (mp.get(s.charAt(i)) < mp.get(s.charAt(i + 1)))  ans -= mp.get(s.charAt(i));
            else                                                ans += mp.get(s.charAt(i));
            i++;
        }
        ans += mp.get(s.charAt(i));
        return ans;
    }
}
