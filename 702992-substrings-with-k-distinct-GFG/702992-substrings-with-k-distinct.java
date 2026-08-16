class Solution {
    public int countSubstr(String s, int k) {
        int n = s.length();
        int count = 0;

        for (int i = 0; i < n; i++) {

            int[] freq = new int[26];
            int distinct = 0;

            for (int j = i; j < n; j++) {

                int index = s.charAt(j) - 'a';

                if (freq[index] == 0) {
                    distinct++;
                }

                freq[index]++;

                if (distinct == k) {
                    count++;
                }
            }
        }

        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna