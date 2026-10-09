class Solution {
    public int maximumProduct(int[] nums) {

        int n=nums.length;
        Arrays.sort(nums);
        int product1 = nums[n-1]*nums[n-2]*nums[n-3];
        int product2 = nums[0]*nums[1]*nums[n-1];
        if(product1  > product2) return product1;
        return product2;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna