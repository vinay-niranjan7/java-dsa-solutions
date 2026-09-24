class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n>1 && n%2!=0) return false;
        for(int i=0;i<=30;i++){
            if(n==Math.pow(2,i)) return true;
        }
        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna