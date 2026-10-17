class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n];
        int i=0,j=0;
        while(j<n){
            if(nums[j]%2==0){
                ans[i++]=nums[j++];
            }else{
                j++;
            }
        }
        j=0;
        while(j<n){
            if(nums[j]%2==1){
                ans[i++]=nums[j++];
            }else{
                j++;
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna