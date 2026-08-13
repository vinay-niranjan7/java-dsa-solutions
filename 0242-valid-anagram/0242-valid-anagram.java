class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length() != t.length())
            return false;

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for(char ch : s.toCharArray())
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);

        for(char ch : t.toCharArray())
            map2.put(ch, map2.getOrDefault(ch, 0) + 1);

        return map1.equals(map2);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna