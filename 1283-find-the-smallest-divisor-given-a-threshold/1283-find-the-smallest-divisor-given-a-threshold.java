class Solution {

    private boolean check(int[] nums, int divisor, int threshold) {

        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += (nums[i] + divisor - 1) / divisor;
        }

        return sum <= threshold;
    }

    public int smallestDivisor(int[] nums, int threshold) {

        int low = 1;
        int high = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > high) {
                high = nums[i];
            }
        }

        int ans = high;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (check(nums, mid, threshold)) {
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