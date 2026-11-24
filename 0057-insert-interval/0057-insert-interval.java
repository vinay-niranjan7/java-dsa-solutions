class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n = intervals.length;
        int res[][] = new int[n+1][2];
        int i = 0;
        int idx = 0;

        //left
        while (i < n && intervals[i][1] < newInterval[0]) {
            res[idx++] = intervals[i++];
        }

        //collision
        while (i < n && intervals[i][0] <= newInterval[1]) {
            newInterval[0]=Math.min(intervals[i][0],newInterval[0]);
            newInterval[1]=Math.max(intervals[i][1],newInterval[1]);
            i++;
        }
        res[idx++] = newInterval;

        //right
         while (i < n) {
            res[idx++] = intervals[i++];
        }
        
        return Arrays.copyOf(res, idx);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna