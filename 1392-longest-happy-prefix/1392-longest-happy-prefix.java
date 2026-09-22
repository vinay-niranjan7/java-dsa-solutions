class Solution {
    public String longestPrefix(String s) {

        int n=s.length();

        for(int len=n-1;len>=1;len--) {

            String prefix=s.substring(0,len);
            String suffix=s.substring(n-len);

            if(prefix.equals(suffix))
                return prefix;
        }
        return "";
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna