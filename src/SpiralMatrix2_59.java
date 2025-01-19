import java.util.Arrays;

public class SpiralMatrix2_59 {
    public static void main (String[] args) {
        int n = 0;

        SpiralMatrix2_59 obj = new SpiralMatrix2_59();
        int[][] result = obj.generateMatrix(n);
        System.out.println(Arrays.deepToString(result));
    }

    public int[][] generateMatrix(int n) {
        int[][] matrixArray = new int[n][n];

        int rowStart = 0, rowEnd = n - 1;
        int colStart = 0, colEnd = n - 1;
        int number = 1;

        while (rowStart <= rowEnd && colStart <= colEnd) {
            for (int j = colStart; j <= colEnd; j++) {
                matrixArray[rowStart][j] = number++;
            }
            rowStart++;

            for (int i = rowStart; i <= rowEnd; i++) {
                matrixArray[i][colEnd] = number++;
            }
            colEnd--;

            for (int j = colEnd; j >= colStart; j--) {
                matrixArray[rowEnd][j] = number++;
            }
            rowEnd--;

            for (int i = rowEnd; i >= rowStart; i--) {
                matrixArray[i][colStart] = number++;
            }
            colStart++;
        }
        return matrixArray;
    }
}
