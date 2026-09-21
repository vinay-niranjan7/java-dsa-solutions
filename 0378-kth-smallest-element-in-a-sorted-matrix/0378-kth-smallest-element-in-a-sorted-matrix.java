class Solution {

    private int upperBound(int[] arr, int target){
        int low=0;
        int high=arr.length;

        while(low<high){
            int mid=low +(high-low)/2;
            if(arr[mid]<=target)
                low=mid+1;
            else
                high=mid;
        }
        return low;
    }

    public int kthSmallest(int[][] matrix, int k) {

        int n=matrix.length;
        int low=matrix[0][0];
        int high=matrix[n - 1][n - 1];

        while(low< high){

            int mid=low +(high-low)/2;
            int cnt=0;
            for(int i=0;i<n;i++) {
                cnt+=upperBound(matrix[i], mid);
            }

            if(cnt<k)
                low = mid + 1;
            else
                high = mid;
        }
        return low;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna