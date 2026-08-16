class Solution {
    public int beautySum(String s) {
        int n = s.length();
        int ans = 0;

        for (int i = 0; i < n; i++) {

            for (int j = i; j < n; j++) {

                int[] freq = new int[26];

                //calc freq
                for (int k = i; k <= j; k++) {
                    freq[s.charAt(k) - 'a']++;
                }

                int maxFreq = 0;
                int minFreq = Integer.MAX_VALUE;

                //max , min
                for (int x : freq) {
                    if (x > 0) {
                        maxFreq = Math.max(maxFreq, x);
                        minFreq = Math.min(minFreq, x);
                    }
                }

                ans += maxFreq - minFreq;
            }
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna