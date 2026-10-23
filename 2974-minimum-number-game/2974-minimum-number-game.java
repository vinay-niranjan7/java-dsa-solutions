class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i+=2){
            int tmp=nums[i+1];
            nums[i+1]=nums[i];
            nums[i]=tmp;
        }
        return nums;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna