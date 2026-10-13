class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int right=0,left=0,res=0;
        char arr[]=s.toCharArray();
        for(;right<arr.length;right++){
            int idx=map.getOrDefault(arr[right],-1);
            if(idx!=-1 && idx>=left){
                res=Math.max(res,right-1-left+1);
                left=idx+1;
            }
            map.put(arr[right],right);
        }
        return Math.max(res,right-1-left+1);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna