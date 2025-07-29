package Leetcode150.ArrayAndStrings;

public class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];

        left[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            left[i] = left[i - 1] * nums[i - 1];
        }

        right[nums.length - 1] = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            right[i] = right[i + 1] * nums[i + 1];
        }

        for(int i = 0; i < nums.length; i++) {
            right[i] = right[i] * left[i];
        }

        return right;
    }

    public int[] optProductExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = 1;
        for(int i = 1; i < nums.length; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        int val = 1;
        for(int j = nums.length - 2; j >= 0; j--) {
            val = val * nums[j + 1];
            result[j] = val * result[j];
        }
        return result;
    }
}
