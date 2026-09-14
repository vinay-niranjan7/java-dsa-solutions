class Solution {
    public void reverseString(char[] s) {
        for(int i=0; i<s.length/2; i++) {
            char tmp=s[i];
            s[i]=s[s.length-i-1];
            s[s.length-i-1]=tmp;
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna