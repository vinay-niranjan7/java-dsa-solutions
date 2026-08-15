class Solution {
    public int myAtoi(String s) {
        
        int n = s.length();
        int i = 0;
        
        //spaces
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }
    
        int sign = 1;
        if (i < n && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
            if (s.charAt(i) == '-') {
                sign = -1;
            }
            i++;
        }
        
        long ans = 0;
        while (i < n && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
            
            ans = ans * 10 + (s.charAt(i) - '0');
            
            //overflow
            if (sign == 1 && ans > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            
            if (sign == -1 && -ans < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            
            i++;
        }
        return (int)(ans * sign);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna