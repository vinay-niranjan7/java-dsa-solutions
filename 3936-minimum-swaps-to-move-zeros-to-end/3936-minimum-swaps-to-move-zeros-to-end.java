class Solution {
    public int minimumSwaps(int[] nums) {
        int i=0,j=nums.length-1;
        int count=0;
        while(i<j){
            if(nums[i] != 0)
                i++;
            else if (nums[j] == 0)
                j--;
            else{
                nums[i]=nums[j];
                nums[j]=0;
                i++;
                j--;
                count++;
            }
        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna