public class Problem0136_SingleNumber {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for (int x: nums)
            ans = ans ^ x;
        return ans;
    }
}
