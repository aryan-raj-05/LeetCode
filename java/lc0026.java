public class lc0026 {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j])
                nums[++i] = nums[j];
        }
        return ++i;
    }
}
