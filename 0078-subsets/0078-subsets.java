class Solution {
    public List<List<Integer>> subsets(int[] nums) 
    {
        List<List<Integer>> ans=new ArrayList<>();
        int n=nums.length;
        int total=(int)Math.pow(2, n);

        for(int num=0; num<total; num++) 
        {
            List<Integer> sub=new ArrayList<>();
            for(int i=0; i<n; i++) 
            {
                if((num & (1 << i)) != 0) {
                    sub.add(nums[i]);
                }
            }
            ans.add(sub);
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna