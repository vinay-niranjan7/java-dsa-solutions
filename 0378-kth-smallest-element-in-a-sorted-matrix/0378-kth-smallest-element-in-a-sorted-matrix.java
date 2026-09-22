class Solution {
    public int kthSmallest(int[][] matrix, int k) {

        int n=matrix.length;
        int low=matrix[0][0];
        int high=matrix[n-1][n-1];

        while(low<high)
        {
            int mid =low+(high-low)/2;
            int cnt=0;
            int row=n-1;
            int col=0;
            //Counting elements <=mid
            while(row>=0&&col<n)
            {
                if(matrix[row][col]<=mid){
                    cnt+=row+1;
                    col++;
                }else
                    row--;
            }
            if(cnt<k)
                low=mid+1;
            else
                high=mid; 
        }
        return low;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna