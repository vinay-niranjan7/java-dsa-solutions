class Solution {
    public int climbStairs(int n) {
        if (n==1 || n==2) return n;

        int prev2=1, prev1=2, cur=0;
        for(int i=3; i<=n; i++){
            cur = prev2+prev1;
            prev2 = prev1;
            prev1 = cur;
        }
        return cur;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna