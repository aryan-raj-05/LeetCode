package Leetcode150.ArrayAndStrings;

import java.util.HashMap;

public class RomanToInt {
    public int romanToInt(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        hm.put('I', 1);
        hm.put('V', 5);
        hm.put('X', 10);
        hm.put('L', 50);
        hm.put('C', 100);
        hm.put('D', 500);
        hm.put('M', 1000);

        int result = 0, i = 0;
        for (; i < s.length() - 1; i++) {
            if (hm.get(s.charAt(i)) < hm.get(s.charAt(i + 1))) {
                result -= hm.get(s.charAt(i));
            } else {
                result += hm.get(s.charAt(i));
            }
        }

        return result + hm.get(s.charAt(i));
    }
}
