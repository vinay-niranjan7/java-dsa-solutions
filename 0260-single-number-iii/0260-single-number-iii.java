class Solution {
    public int[] singleNumber(int[] nums) {
        int ans[] = {-1,-1};
        
        int idx=0;
        for(int i=0;i<nums.length;i++){
            boolean found = false;
            for(int j=0;j<nums.length;j++){
                if(i!=j && nums[i]==nums[j]){
                    found=true;
                    break;
                }    
            }
            if(!found)
                ans[idx++]=nums[i];
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna