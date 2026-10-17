class Solution {
    public String reverseOnlyLetters(String s) {
        char[] arr=s.toCharArray();
        int i=0,j=s.length()-1;
        while(i<j){
            if(!Character.isLetter(arr[i]))
                i++;
            else if(!Character.isLetter(arr[j]))
                j--;
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