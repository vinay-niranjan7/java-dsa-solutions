class Solution {
    public int pivotIndex(int[] nums) {
        int prefixSum=Integer.MIN_VALUE;
        int postfixSum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            prefixSum=0;
            postfixSum=0;
            for(int j=0;j<i;j++){
                prefixSum+=nums[j];
            }
            for(int k=i+1;k<nums.length;k++){
                postfixSum+=nums[k];
            }
            if(prefixSum == postfixSum) return i;
        }
        return -1; 
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna