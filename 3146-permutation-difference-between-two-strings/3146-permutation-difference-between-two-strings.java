class Solution {
    public int findPermutationDifference(String s, String t) {
         if(s.length()!=t.length()) return -1;

        int[] pos = new int[26];
        for(int i = 0; i < s.length(); i++){
            pos[s.charAt(i) -'a']=i;
        }

        int sum = 0;
        for(int i = 0; i < t.length(); i++) {
            sum += Math.abs(pos[t.charAt(i) -'a']-i);
        }
        return sum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna