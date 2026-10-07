class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] ans = new int[nums.length];

        for(int i=0; i<nums.length;i++){
            int mul = 1;

            for(int j=0; j<nums.length;j++){

                if(j == i)
                    continue;

                mul *= nums[j];
            }
            ans[i] = mul;
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna