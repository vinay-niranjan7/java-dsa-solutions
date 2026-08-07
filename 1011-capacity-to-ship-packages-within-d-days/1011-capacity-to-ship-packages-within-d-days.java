class Solution {

    private int countDays(int[] weights, int capacity) {

        int days = 1;
        int load = 0;

        for (int i = 0; i < weights.length; i++) {

            if (load + weights[i] > capacity) {
                days++;
                load = weights[i];
            } else {
                load += weights[i];
            }
        }

        return days;
    }

    public int shipWithinDays(int[] weights, int days) {

        int low = weights[0];
        int high = 0;

        for (int i = 0; i < weights.length; i++) {
            if (weights[i] > low) {
                low = weights[i];
            }
            high += weights[i];
        }

        int ans = high;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (countDays(weights, mid) <= days) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna