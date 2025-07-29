package Leetcode150.HashMap;

import java.util.HashMap;

public class IsomorphicStrings {
    private boolean check(String s, String t, boolean isReverse) {
        HashMap<Character, Character> hm = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char k = s.charAt(i), v = t.charAt(i);
            if (isReverse) {
                char temp = k;
                k = v;
                v = temp;
            }
            if (!hm.containsKey(k))     hm.put(k, v);
            else if (hm.get(k) != v)    return false;
        }
        return true;
    }

    public boolean isIsomorphic(String s, String t) {
        return check(s, t, true) && check(s, t, false);
    }
}
