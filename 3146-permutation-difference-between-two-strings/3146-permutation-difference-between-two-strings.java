class Solution {
    public int findPermutationDifference(String s, String t) {
        if (s.length() != t.length()) return -1;

        HashMap<Character,Integer> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            map.put(s.charAt(i), i);
        }

        int sum = 0;
        for(int i = 0; i < t.length(); i++){
            char ch = t.charAt(i);

            if(map.containsKey(ch)){
                sum += Math.abs(map.get(ch) - i);
            }
        }
        return sum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna