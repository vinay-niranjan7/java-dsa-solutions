class Solution {
    public int reverseBits(int n) {
        int[] bits=new int[32];

        for(int i=0; i<32; i++){
            bits[i] = n&1;
            n >>>= 1;
        }

        int result=0;
        for(int i=0; i<32; i++){
            result =(result << 1) | bits[i];
        }
        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna