class Solution {
    public boolean checkValidString(String s) {
        Map<Integer, Integer> openMap = new HashMap<>();
        Map<Integer, Integer> starMap = new HashMap<>();
        int openCount = 0;
        int starCount = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                openMap.put(openCount++, i);
            } else if (ch == '*') {
                starMap.put(starCount++, i);
            } else {
                if (openCount > 0) {
                    openMap.remove(--openCount);
                } else if (starCount > 0) {
                    starMap.remove(--starCount);
                } else {
                    return false;
                }
            }
        }

        while (openCount > 0 && starCount > 0) {
            int lastOpenIndex = openMap.remove(--openCount);
            int lastStarIndex = starMap.remove(--starCount);

            if (lastOpenIndex > lastStarIndex) {
                return false;
            }
        }

        return openCount == 0;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna