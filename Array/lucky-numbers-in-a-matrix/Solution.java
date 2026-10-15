
import java.util.*;

class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            int min = matrix[i][0];
            int col = 0;

            // Find minimum element in the row
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    col = j;
                }
            }

            // Check if it is maximum in its column
            boolean isMax = true;

            for (int k = 0; k < matrix.length; k++) {
                if (matrix[k][col] > min) {
                    isMax = false;
                    break;
                }
            }

            if (isMax) {
                ans.add(min);
            }
        }

        return ans;
    }
}
