class Solution {
    public boolean checkString(String s) {
        int idx=-1;
        for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)=='b')
                {
                    idx=i;
                    break;
                }
            }
        if (idx == -1) 
            return true;
        for(int i=idx;i<s.length();i++){
            if(s.charAt(i)=='a')
                return false;
        }
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna