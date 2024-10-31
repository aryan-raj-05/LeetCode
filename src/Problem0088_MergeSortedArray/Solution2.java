package Problem0088_MergeSortedArray;

/*
    In the first approach we created an
    auxiliary array and copied all elements
    of nums1 to it.

    This method will take up O(n) space

    We can optimize the solution by initializing
    two pointers to m-1 and n-1 and filling
    the nums1 array from end up.
 */

public class Solution2 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = (m + n) - 1;

        while (j >= 0) {
            if ((i >= 0) && (nums1[i] > nums2[j])) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
    }
}
