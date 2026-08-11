class Solution {
    public int maximum69Number(int num) {
        String str=String.valueOf(num);
        char[] arr=str.toCharArray();
        int l=0;
        int r=arr.length-1;

        while(l<=r) {
            if(arr[l]=='9')
                l++;
            else {
                swap(arr,l,l);
                arr[l]='9';
                break;
            }
        }

        return Integer.parseInt(new String(arr));
    }

    public void swap(char[] arr,int i,int j) {
        char temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna