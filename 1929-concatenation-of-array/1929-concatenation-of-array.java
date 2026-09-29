class Solution {
    public int[] getConcatenation(int[] nums) {
        int size=nums.length*2;
        int ans[]=new int[size];
        int i=0,j=0;
        while(j<size){
            if(i==nums.length) i=0;
            ans[j++]=nums[i++];
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna