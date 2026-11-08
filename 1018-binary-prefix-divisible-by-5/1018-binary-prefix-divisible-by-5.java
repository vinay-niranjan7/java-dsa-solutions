class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        ArrayList<Boolean> ans= new ArrayList<>();
        int rem = 0;
        for(int i=0;i<nums.length;i++){
            rem =(rem*2+nums[i])%5;
            if(rem == 0) ans.add(true);
            else ans.add(false);
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna