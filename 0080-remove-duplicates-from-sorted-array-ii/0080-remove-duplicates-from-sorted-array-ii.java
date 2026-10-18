class Solution {
    public int removeDuplicates(int[] nums) {
        TreeMap<Integer,Integer> map=new TreeMap<>();
        for (int n : nums) {
            if (map.getOrDefault(n, 0) < 2) {
                map.put(n, map.getOrDefault(n, 0) + 1);
            }
        }
        int i = 0;
        for (int key : map.keySet()) {
            int count=map.get(key);

            while (count-- > 0) {
                nums[i++]=key;
            }
        }
        return i;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna