class Solution {
    public boolean checkValidString(String s) {
    
        int min=0,max=0;
        for (int i=0; i<s.length(); i++) {
            char ch=s.charAt(i);

            if(ch == '('){
                min++;
                max++;
            } else if(ch == ')'){
                min--;
                max--;
            } else{
                min--;
                max++;
            }
            if(min < 0) min=0;
            if(max < 0) return false;
        }
        return min == 0;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna