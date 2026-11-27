class Solution {
    public boolean checkValidString(String s) {
        int n = s.length();
        Boolean[][] dp = new Boolean[n][n + 1];
        return check(s, 0, 0, dp);
    }

    private boolean check(String s, int ind, int cnt, Boolean[][] dp) {
        if (cnt < 0) {
            return false;
        }
        
        if (ind == s.length()) {
            return cnt == 0;
        }

        if (dp[ind][cnt] != null) {
            return dp[ind][cnt];
        }

        char ch = s.charAt(ind);
        boolean isValid;

        if (ch == '(') {
            isValid = check(s, ind + 1, cnt + 1, dp);
        } else if (ch == ')') {
            isValid = check(s, ind + 1, cnt - 1, dp);
        } else {
            isValid = check(s, ind + 1, cnt + 1, dp) || 
                      check(s, ind + 1, cnt - 1, dp) || 
                      check(s, ind + 1, cnt, dp);
        }

        return dp[ind][cnt] = isValid;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna