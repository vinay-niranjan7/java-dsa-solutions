class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        int[] prodstart = new int[n],
              prodend = new int[n],
              res = new int[n];

        prodstart[0] = nums[0];

        for (int i = 1; i < n; i++) {
            prodstart[i] = prodstart[i - 1] * nums[i];
        }

        prodend[n - 1] = nums[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            prodend[i] = prodend[i + 1] * nums[i];
        }

        res[0] = prodend[1];
        res[n - 1] = prodstart[n - 2];

        for (int i = 1; i < n - 1; i++) {
            res[i] = prodstart[i - 1] * prodend[i + 1];
        }

        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna