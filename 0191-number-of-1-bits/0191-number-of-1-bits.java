class Solution {
    public int hammingWeight(int n) {
        int cnt=0;
        while(n>1){
            if(n%2==1) cnt++;
            n=n/2;
        }
        if(n==1) cnt+=1;
        return cnt;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna