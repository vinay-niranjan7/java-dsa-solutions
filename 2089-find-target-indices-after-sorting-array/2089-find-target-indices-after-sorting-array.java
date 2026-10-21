class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        
        List<Integer> list = new ArrayList<>();
        int smaller = 0;
        int equal = 0;

        for(int num : nums){
            if (num < target)
                smaller++;
            else if (num == target)
                equal++;
        }

        for(int i = smaller; i<smaller+equal; i++){
            list.add(i);
        }
        return list;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna