public class Problem2639_FindtheWidthOfColumsOfAGrid {
    public int[] findColumnWidth(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int[] res = new int[n];

        for (int i = 0; i < n; i++) {
            int maxVal = Integer.MIN_VALUE;
            for (int[] val : grid) {
                maxVal = Integer.max(maxVal, lenDigit(val[i]));
            }
            res[i] = maxVal;
        }

        return res;
    }

    public int lenDigit(int n) {
        if (n == 0)
            return 1;
        int count = (n < 0) ? 1 : 0;
        while (n != 0) {
            n /= 10;
            count++;
        }
        return count;
    }
}
