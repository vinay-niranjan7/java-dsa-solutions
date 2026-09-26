class Solution {
    public void duplicateZeros(int[] a) {

        for(int i=0;i<a.length;i++)
        {
            if (a[i] == 0) 
            {
                for(int j=a.length-1;j>i;j--)
                {
                    a[j]=a[j-1];
                }
                // Duplicate zero
                if(i+1 <a.length){
                    a[i+1]=0;
                }
                i++; 
            }
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna