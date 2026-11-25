class Solution {
    public int minGroups(int[][] intervals) {
        int n = intervals.length;
        int[] start = new int[n];
        int[] end = new int[n];

        for (int k = 0; k < n; k++) {
            start[k] = intervals[k][0];
            end[k] = intervals[k][1];
        }

        Arrays.sort(start);
        Arrays.sort(end);

        int i = 0, j = 0;
        int res = 0;
        int groups = 0;

        while (i < n) {
            if (start[i] <= end[j]) {
                groups++;
                i++;
            } else {
                groups--;
                j++;
            }
            res = Math.max(res, groups);
        }

        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna