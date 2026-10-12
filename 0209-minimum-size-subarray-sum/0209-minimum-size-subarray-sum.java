class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i=0,j=0,sum=0,len=Integer.MAX_VALUE;
        while(j<nums.length){
            sum+=nums[j++];
            while(sum>=target){
               len=Math.min(len,j-i);
               sum-=nums[i++]; 
            }
        }
        return len == Integer.MAX_VALUE ? 0 : len;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna