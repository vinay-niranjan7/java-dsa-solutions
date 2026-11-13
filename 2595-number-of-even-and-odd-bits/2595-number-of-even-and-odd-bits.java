class Solution {
    public int[] evenOddBit(int n) {
        int even = 0;
        int odd = 0;
        int index = 0;
        
        while(n>0){
            int val = n%2;
            if(val==1){
                if(index%2==0) even++;
                else odd++;
            }
            n=n/2;
            index++;
        }
        
        return new int[]{even,odd};
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna