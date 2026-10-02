class Solution {
    public int getSum(int a, int b) {
        while(b != 0){
            int tmp=(a & b)<<1;
            a=a^b;
            b=tmp;
        }
        return a;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna