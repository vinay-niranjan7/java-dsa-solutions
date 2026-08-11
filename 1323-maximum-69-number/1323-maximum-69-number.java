class Solution {
    public int maximum69Number(int num) {
        char[] arr=String.valueOf(num).toCharArray();

        for(int i=0;i<arr.length;i++) {
            if(arr[i]=='6') {
                arr[i]='9';
                break;
            }
        }

        return Integer.parseInt(new String(arr));
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna