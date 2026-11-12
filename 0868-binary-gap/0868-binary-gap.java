
class Solution {
    public int binaryGap(int n) {
        StringBuilder str = new StringBuilder();

        while (n > 0) {
            str.append(n % 2);
            n = n / 2;
        }

        str.reverse();

        int prev = -1;
        int max = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '1') {

                if (prev != -1) {
                    max = Math.max(max, i - prev);
                }

                prev = i;
            }
        }

        return max;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna