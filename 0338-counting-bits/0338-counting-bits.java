class Solution {
    public int[] countBits(int n) {
        int arr[]=new int[n+1];
    
        for(int i=0;i<=n;i++){
            arr[i] = arr[i/2] + (i%2);
        }
        return arr;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna