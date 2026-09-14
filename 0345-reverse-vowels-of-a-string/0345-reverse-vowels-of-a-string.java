class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int i=0;
        int j=arr.length - 1;

        while(i<j) 
        {
            if("AEIOUaeiou".indexOf(arr[i])==-1){
                i++;
            }
            else if("AEIOUaeiou".indexOf(arr[j])==-1){
                j--;
            }
            else{
                char temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;

                i++;
                j--;
            }
        }
        return new String(arr);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna