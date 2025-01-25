public class Search2DMatrix2_240 {
    public static void main (String[] args) {

//        int[][] matrix = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
//        int target = 5;
//        int[][] matrix = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
//        int target = 20;
        int[][] matrix = {{-5}};
        int target = -10;

        Search2DMatrix2_240 obj = new Search2DMatrix2_240();
        boolean result = obj.searchMatrix(matrix, target);
        System.out.println(result);
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length < 1 || matrix[0].length <1) {
            return false;
        }
        int down = 0, right = matrix[0].length - 1;
        System.out.println("matrix.length => " + matrix.length);
        while (down < matrix.length && right >= 0) {
            System.out.println("down => " + down);
            System.out.println("right => " + right);
            int val = matrix[down][right];
            System.out.println("val => " + val);
            if (val == target) {
                return true;
            } else if (val > target) {
                right--;
            } else {
                down++;
            }
        }
        return false;
    }
}
