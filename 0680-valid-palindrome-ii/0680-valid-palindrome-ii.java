class Solution {
    public boolean validPalindrome(String s) {
        int i=0,j=s.length()-1;
        char arr[]=s.toCharArray();
        while(i<j){
            if(arr[i]==arr[j]){
                i++;
                j--;
            }
            else{
                return isPalindrome(arr, i, j-1) || isPalindrome(arr, i+1, j);
            }
        }
        return true;
    }
    boolean isPalindrome(char[] arr,int i,int j) {
        while(i<j){
            if(arr[i]!=arr[j]) return false;
            i++;
            j--;
        }
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna