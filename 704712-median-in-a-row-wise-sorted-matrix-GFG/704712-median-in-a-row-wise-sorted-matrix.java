class Solution {
    int upperBound(int[] arr, int x) {
        int low = 0, high = arr.length;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] <= x)
                low = mid + 1;
            else
                high = mid;
        }

        return low;
    }

    int median(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            low = Math.min(low, mat[i][0]);
            high = Math.max(high, mat[i][m - 1]);
        }

        int required = (n * m) / 2;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            int count = 0;

            for (int i = 0; i < n; i++) {
                count += upperBound(mat[i], mid);
            }

            if (count <= required)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return low;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna