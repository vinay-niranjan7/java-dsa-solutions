class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max=Double.NEGATIVE_INFINITY;
        for(int i=0;i<=nums.length-k;i++){
            double sum=0;
            for(int j=i;j<k+i;j++){
                sum+=nums[j];
            }
            double avg=sum/k;
            if(avg>max) max=avg;
        }
        return max;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna