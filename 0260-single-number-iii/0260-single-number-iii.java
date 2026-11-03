class Solution {
    public int[] singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int xorr = 0;
        for(int num : nums){
            xorr ^= num;
            set.add(num);
        }

        for(int num : set){
            int check = xorr ^ num;

            if(set.contains(check)) 
                return new int[]{num, check};
        }
        return new int[]{-1, -1};
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna