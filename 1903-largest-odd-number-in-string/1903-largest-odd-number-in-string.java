class Solution {
    public String largestOddNumber(String num) {
        int i=num.length()-1;

        while(i>=0) {
            if((num.charAt(i)-'0')%2!=0) {
                return num.substring(0,i+1);
            }
            i--;
        }

        return "";
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna