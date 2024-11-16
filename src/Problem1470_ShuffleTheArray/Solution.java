package Problem1470_ShuffleTheArray;

public class Solution {
    public int[] shuffle(int[] nums, int n) {
        // there's a better way of solving this problem
        // with O(1) space complexity
        // will do that later
        int[] res = new int[nums.length];
        int i = 0, j = n, k = 0;
        while (i < n && j < nums.length) {
            res[k++] = nums[i++];
            res[k++] = nums[j++];
        }
        return res;
    }
}
