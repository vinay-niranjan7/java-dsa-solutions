class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int ans=0;
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int prevEnd=intervals[0][1];

        for(int i=1; i<intervals.length; i++){
            int start=intervals[i][0];
            int end=intervals[i][1];

            if(start>=prevEnd){
                prevEnd=end;
            }
            else{
                ans++;
                prevEnd=Math.min(end,prevEnd);
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna