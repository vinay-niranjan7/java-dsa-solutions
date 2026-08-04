import java.util.*;

class Solution {
    int median(int[][] mat) {
        
        ArrayList<Integer> list = new ArrayList<>();

        
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                list.add(mat[i][j]);
            }
        }

        Collections.sort(list);
        int mid = list.size() / 2;
        return list.get(mid);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
