class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n=image.length;
        int m=image[0].length;
        for(int i=0; i<n ;i++){
            for(int j=0; j<(m+1)/2 ;j++){
                int temp = image[i][j];

                image[i][j] = 1 - image[i][m-j-1];
                image[i][m-j-1] = 1 - temp;
            }
        }
        return image;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna