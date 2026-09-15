class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> ans=new ArrayList<>();

        for(int i=0;i<nums1.length;i++){
            list.add(nums1[i]);
        }

        for(int i=0;i<nums2.length;i++){
            if(list.contains(nums2[i]) && !ans.contains(nums2[i])){
                ans.add(nums2[i]);
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