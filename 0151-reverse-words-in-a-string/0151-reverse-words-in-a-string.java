class Solution {
    public String reverseWords(String s) {
        int l=s.length()-1;
        int r=s.length()-1;

        StringBuilder ans=new StringBuilder();

        while(l>=0) {

            while(l>=0 && s.charAt(l)==' ')
                l--;

            if(l<0)
                break;

            r=l;

            while(l>=0 && s.charAt(l)!=' ')
                l--;

            if(ans.length()>0)
                ans.append(" ");

            ans.append(s.substring(l+1,r+1));
        }

        return ans.toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna