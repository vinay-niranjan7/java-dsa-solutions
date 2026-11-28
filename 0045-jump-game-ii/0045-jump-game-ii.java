class Solution {
    public int jump(int[] nums) {
        int ans=calcJumps(0,0,nums);
        return ans;
    }

    private int calcJumps(int idx, int jumps, int nums[]){
        if(idx == nums.length-1 ) return jumps;
        int mini=Integer.MAX_VALUE;
        for(int i=1; i<=nums[idx] && idx+i<nums.length; i++){
            mini=Math.min(mini, calcJumps(idx+i, jumps+1, nums));
        }
        return mini;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna