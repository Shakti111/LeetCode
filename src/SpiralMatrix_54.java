import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class SpiralMatrix_54 {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        SpiralMatrix_54 obj = new SpiralMatrix_54();
        List<Integer> result = obj.spiralOrder(matrix);
        System.out.println(result);
    }

    public List<Integer> spiralOrder(int[][] matrix) {
        int rowStart = 0, rowEnd = matrix.length-1;
        int colStart = 0, colEnd = matrix[0].length-1;

        List<Integer> returnList = new ArrayList<>();

        while (rowStart <= rowEnd && colStart <= colEnd) {
            for (int j = colStart; j <= colEnd; j++) {
                returnList.add(matrix[rowStart][j]);
            }
            rowStart++;
            for (int i = rowStart; i <= rowEnd; i++) {
                returnList.add(matrix[i][colEnd]);
            }
            colEnd--;

            if (rowStart <= rowEnd) {
                for (int j = colEnd; j >= colStart; j--) {
                    returnList.add(matrix[rowEnd][j]);
                }
            }
            rowEnd--;
            if (colStart <= colEnd) {
                for (int i = rowEnd; i >= rowStart; i--) {
                    returnList.add(matrix[i][colStart]);
                }
            }
            colStart++;
        }

        return returnList;
    }
}
