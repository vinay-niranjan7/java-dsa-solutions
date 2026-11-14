class Solution {
    public int minBitFlips(int start, int goal) {
        int diff = start ^ goal;
        return Integer.bitCount(diff);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna