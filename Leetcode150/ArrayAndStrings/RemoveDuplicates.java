package Leetcode150.ArrayAndStrings;

// 26. Remove Duplicates from Sorted Array

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] == nums[j]) continue;
            else                    nums[++i] = nums[j];
        }
        return i + 1;
    }
}
