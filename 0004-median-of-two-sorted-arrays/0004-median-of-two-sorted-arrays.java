class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int n1 = nums1.length;
        int n2 = nums2.length;

        int n = n1 + n2;

        int idx1 = (n - 1) / 2;
        int idx2 = n / 2;

        int i = 0, j = 0;
        int cnt = 0;

        int ele1 = 0, ele2 = 0;

        while (i < n1 && j < n2) {

            int cur;

            if (nums1[i] < nums2[j]) {
                cur = nums1[i++];
            } else {
                cur = nums2[j++];
            }

            if (cnt == idx1)
                ele1 = cur;

            if (cnt == idx2)
                ele2 = cur;

            cnt++;
        }


        while (i < n1) {

            int cur = nums1[i++];

            if (cnt == idx1)
                ele1 = cur;

            if (cnt == idx2)
                ele2 = cur;

            cnt++;
        }


        while (j < n2) {

            int cur = nums2[j++];

            if (cnt == idx1)
                ele1 = cur;

            if (cnt == idx2)
                ele2 = cur;

            cnt++;
        }


        if (n % 2 == 1)
            return ele2;

        return (ele1 + ele2) / 2.0;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna