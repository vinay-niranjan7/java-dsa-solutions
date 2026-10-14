class Solution {
    public int hammingWeight(int n) {
        if(n==1) return 1;
        int cnt=0;
        while(n>1){
            n=n&(n-1);
            cnt++;
        }
        return cnt;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna