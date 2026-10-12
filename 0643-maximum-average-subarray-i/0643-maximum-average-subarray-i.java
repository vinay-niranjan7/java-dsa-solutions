class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max;
        double sum=0;
        int i=0;
        int j=0;
        while(j<k){
            sum+=nums[j];
            j++;
        }
        double avg=sum/k;
        max=avg;
        while(j<nums.length){
            sum-=nums[i++];
            sum+=nums[j++];
            avg=sum/k;
            if(avg>max) max=avg;
        }
        return max;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna