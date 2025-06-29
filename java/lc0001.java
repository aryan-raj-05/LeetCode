import java.util.HashMap;

public class lc0001 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (mp.get(target - nums[i]) == null) {
                mp.put(nums[i], i);
            } else {
                res[0] = i;
                res[1] = mp.get(target - nums[i]);
            }
        }
        return res;
    }
}
