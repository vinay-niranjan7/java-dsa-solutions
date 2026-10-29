class Solution {
    public int climbStairs(int n) {
        if(n==1 || n==2)return n;
        int arr[]=new int[n+1];
        for(int i=0;i<=2;i++){
            arr[i]=i;
        }
        for(int i=3;i<=n;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        return arr[n];
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna