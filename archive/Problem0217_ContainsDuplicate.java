import java.util.HashSet;

public class Problem0217_ContainsDuplicate {
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
