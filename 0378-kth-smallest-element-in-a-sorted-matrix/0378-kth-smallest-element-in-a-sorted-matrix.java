class Solution{
    public int kthSmallest(int[][] matrix, int k){
        int n = matrix.length;

        int[] arr=new int[n*n];
        int index=0;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[index++]=matrix[i][j];
            }
        }

        Arrays.sort(arr);
        int cnt=0;
        for(int i=0;i<arr.length;i++) {
            cnt++;
            if(cnt == k) return arr[i];
        }
        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna