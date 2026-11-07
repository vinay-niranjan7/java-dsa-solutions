class Solution {
    public int integerReplacement(int num) {
        long n=num;
        int ans=-1;
        while(n>0){
            if(n%2==0){
                n=n/2;
            }else if(n==3 || (n/2)%2==0){
                n=n-1;
            }else{
                n=n+1;
            }
            ans++;
        }
       return ans; 
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna