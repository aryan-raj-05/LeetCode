/*
    Approach: Create an auxiliary array of size m
        and copy all elements of nums1 to aux and
        then use two pointer to merge the array and
        save the value in nums1
 */

public class lc0088 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] aux = new int[m];
        System.arraycopy(nums1, 0, aux, 0, m);
        int i = 0, j = 0, k = 0;

        while (i < m && j < n) {
            if (aux[i] < nums2[j]) {
                nums1[k] = aux[i];
                i++;
            } else {
                nums1[k] = nums2[j];
                j++;
            }
            k++;
        }

        if (i < m || j < n) {
            while (i < m) {
                nums1[k] = aux[i];
                i++;
                k++;
            }

            while (j < n) {
                nums1[k] = nums2[j];
                j++;
                k++;
            }
        }
    }
}

/*
    In the first approach we created an
    auxiliary array and copied all elements
    of nums1 to it.

    This method will take up O(n) space

    We can optimize the solution by initializing
    two pointers to m-1 and n-1 and filling
    the nums1 array from end up.
 */

class Solution2 {
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
