class Solution {
    public int[] evenOddBit(int n) {
        int odd=0,even=0;
        StringBuilder str= new StringBuilder();
        while(n>0){
            str.append(n%2);
            n=n/2;
        }
        str.reverse();
        for(int i=0; i<str.length(); i++){
            int index = str.length()-1-i;
            if(str.charAt(i)=='1'){
                if(index%2 == 0) even++;
                else odd++;
            }
        }
        return new int[]{even,odd};
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna