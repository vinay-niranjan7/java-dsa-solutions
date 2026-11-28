class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        int l=0,r=0,jumps=0;

        while(r < n-1){
            int max=0;
            for(int i=l; i<=r; i++){
                max=Math.max(max,i+nums[i]);
            }
            l=r+1;
            r=max;
            jumps++;
        }
        return jumps;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna