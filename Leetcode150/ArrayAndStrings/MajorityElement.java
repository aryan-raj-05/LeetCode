package Leetcode150.ArrayAndStrings;

public class MajorityElement {
    public int majority(int[] nums) {
        int m = 0, c = 0;
        for (int i = 0; i < nums.length; i++) {
            if (c == 0) {
                m = nums[i];
                c = 1;
            }
            else if (m == nums[i])  c++;
            else                    c--;
        }
        return m;
    }
}