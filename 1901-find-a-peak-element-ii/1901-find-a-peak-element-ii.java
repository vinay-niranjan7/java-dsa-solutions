class Solution {
    public int findMax(int mat[][],int n,int m,int col){
        int max=Integer.MIN_VALUE;
        int idx=-1;
        for(int i=0;i<n;i++){
            if(mat[i][col]> max){
                max=mat[i][col];
                idx=i;
            }
        }
        return idx;
    }
    public int[] findPeakGrid(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int low=0;int high=m-1;
        while(low<=high){
            int mid=(low+high)/2;
            int maxColIdx=findMax(mat,n,m,mid);
            int left=mid-1>=0 ?mat[maxColIdx][mid-1] :-1;
            int right=mid+1<m ?mat[maxColIdx][mid+1] :-1;
            if(mat[maxColIdx][mid]>left && mat[maxColIdx][mid]>right )
                return new int[]{maxColIdx,mid};
            else if(mat[maxColIdx][mid]<left)
                high=mid-1;
            else 
                low=mid+1;
        }
        return new int[]{-1,-1};  
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna