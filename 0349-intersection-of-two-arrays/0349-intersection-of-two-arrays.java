class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set =new HashSet<>();
        ArrayList<Integer> ans=new ArrayList<>();

        for(int num:nums1){
            set.add(num);
        }

        for(int num:nums2){
            if(set.contains(num)){
                ans.add(num);
                set.remove(num);
            }
        }

        int[] result=new int[ans.size()];

        for(int i=0;i<ans.size();i++) {
            result[i]=ans.get(i);
        }
        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna