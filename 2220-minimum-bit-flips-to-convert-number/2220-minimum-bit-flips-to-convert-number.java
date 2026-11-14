class Solution {
    public int minBitFlips(int start, int goal) {
        int total=start^goal;
        int cnt=0;
        while(total>0){
            int diff=total%2;
            if(diff==1) cnt++;
            total=total/2;
        }

        return cnt;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna