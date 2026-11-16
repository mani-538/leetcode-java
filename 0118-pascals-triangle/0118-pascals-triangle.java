import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        for (int row = 0; row < numRows; row++) {
            List<Integer> currentRow = new ArrayList<>();

            for (int column = 0; column <= row; column++) {
                if (column == 0 || column == row) {
                    currentRow.add(1);
                } else {
                    int valueAboveLeft = result.get(row - 1).get(column - 1);
                    int valueAbove = result.get(row - 1).get(column);

                    currentRow.add(valueAboveLeft + valueAbove);
                }
            }

            result.add(currentRow);
        }

        return result;
    }
}