class Solution {
    public int singleNumber(int[] nums) {
        int ones=0;
        int tows=0;

        for(int num : nums){
            ones = (ones^num) & ~tows;
            tows = (tows^ num) & ~ones;
        }
        
        return ones;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna