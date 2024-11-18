package Problem0217_ContainsDuplicate;

import java.util.HashSet;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();

        for (int x: nums) {
            if (hs.contains(x))
                return true;
            hs.add(x);
        }

        return false;
    }
}
