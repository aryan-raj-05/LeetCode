package Leetcode150.ArrayAndStrings;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) return 0;
        int i = -1;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] == val) {
                continue;
            } else {
                nums[++i] = nums[j];
            }
        }
        return i + 1;
    }
}
