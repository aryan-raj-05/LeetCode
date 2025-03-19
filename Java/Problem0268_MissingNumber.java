public class Problem0268_MissingNumber {
    public int missingNumber(int[] nums) {
        int len = nums.length;
        int sum = len * (len + 1) / 2;
        for (var x: nums)
            sum -= x;
        return sum;
    }
}
