class Solution {
    public char findTheDifference(String s, String t) {
        
        int[] ans = new int[26];

        for(char c : s.toCharArray()){
            ans[c - 'a']++;
        }
         for(char c : t.toCharArray()){
            ans[c - 'a']--;
        }
        for(char c : t.toCharArray()){
            if(ans[c - 'a'] < 0){
              return c;
            }
        }
      return ' ';
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna