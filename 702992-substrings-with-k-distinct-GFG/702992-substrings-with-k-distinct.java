class Solution {
    int countSubstr(String s, int k) {

        int cnt = 0;
        for (int i = 0; i < s.length(); i++) 
        {
            for (int j = i; j < s.length(); j++) 
            {
                boolean[] visited = new boolean[26];
                int distinct = 0;

                for (int l = i; l <= j; l++) 
                {
                    if (!visited[s.charAt(l) - 'a']) {
                        visited[s.charAt(l) - 'a'] = true;
                        distinct++;
                    }
                }
                if (distinct == k) {
                    cnt++;
                }
            }
        }

        return cnt;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna