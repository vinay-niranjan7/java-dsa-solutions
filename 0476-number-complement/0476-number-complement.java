class Solution {
    public int findComplement(int num) {
        if(num == 0) return 1;

        int ans=0;
        int pos=0;
        while(num>0){
            int digit=num%2;
            if(digit==1) digit=0;
            else digit=1;
            ans+= digit * Math.pow(2,pos);
            pos++;
            num=num/2;
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna