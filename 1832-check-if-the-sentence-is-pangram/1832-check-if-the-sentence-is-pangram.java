class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean arr[]=new boolean[26];

        for(char c : sentence.toCharArray()){
            arr[c-'a']=true;
        }

        for(boolean val:arr){
            if(val==false) return false;
        }
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna