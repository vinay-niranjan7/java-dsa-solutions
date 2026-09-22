class Solution {
    public String longestPrefix(String s) {
        
        int n = s.length();
        String[] prefix=new String[n-1];
        String[] suffix=new String[n-1];
        
        for(int i=0;i<n-1;i++) {
            prefix[i]=s.substring(0,i+1);
        }

        for(int i=0;i<n-1;i++) {
            suffix[i]=s.substring(n-1-i,n);
        }

        for(int i=n-2;i>= 0;i--){
            for(int j=n-2;j>=0;j--){

                if(prefix[i].equals(suffix[j])) 
                    return prefix[i];
            }
        }
        return "";
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna