public class lc0136 {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for (int x: nums)
            ans = ans ^ x;
        return ans;
    }
}
