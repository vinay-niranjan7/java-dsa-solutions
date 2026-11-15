class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        int arr[]=new int[26];
        for(Character c: word1.toCharArray()){
            arr[c-'a']++;
        }
        for(Character c: word2.toCharArray()){
            arr[c-'a']--;
        }

        for(int i=0;i<arr.length;i++){
            if(Math.abs(arr[i])>3) return false;
        }
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna