import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ValidSudoku_36 {
    public static void main (String[] args) {
        char[][] board =
            {{'5','3','.','.','7','.','.','.','.'}
            ,{'6','.','.','1','9','5','.','.','.'}
            ,{'.','9','8','.','.','.','.','6','.'}
            ,{'8','.','.','.','6','.','.','.','3'}
            ,{'4','.','.','8','.','3','.','.','1'}
            ,{'7','.','.','.','2','.','.','.','6'}
            ,{'.','6','.','.','.','.','2','8','.'}
            ,{'.','.','.','4','1','9','.','.','5'}
            ,{'.','.','.','.','8','.','.','7','9'}};

        ValidSudoku_36 obj = new ValidSudoku_36();
        boolean result = obj.isValidSudoku(board);
        System.out.println(result);
    }

    public boolean isValidSudoku(char[][] board) {
        Map<Integer, HashSet<Character>> colSet = new HashMap<>();
        Map<Integer, HashSet<Character>> boxSet = new HashMap<>();

        int rows = board.length;
        int cols = board[0].length;

        for (int i = 0; i < rows; i++) {
            HashSet<Character> hashSet = new HashSet<>();
            for (int j = 0; j < cols; j++) {
                // for rows
                char current = board[i][j];
                if (current == '.') {
                    continue;
                }
                if (hashSet.contains(current)) {
                    return false;
                }
                hashSet.add(current);
                //for cols
                colSet.computeIfAbsent(j, k -> new HashSet<>());
                HashSet<Character> currColset = colSet.get(j);
                if (currColset.contains(current)) {
                    return false;
                }
                currColset.add(current);
                //for boxes
                //We need to determine current box
                int subBoxIndex = findSubBoxIndex(i, j);
                boxSet.computeIfAbsent(subBoxIndex, k -> new HashSet<>());
                HashSet<Character> currBoxset = boxSet.get(subBoxIndex);
                if (currBoxset.contains(current)) {
                    return false;
                }
                currBoxset.add(current);
            }

        }
        System.out.println(colSet);
        System.out.println(boxSet);
        return true;
    }

    public int findSubBoxIndex(int row, int col) {
        int rowSubBox = row/3;
        int colSubBox = col/3;

        return rowSubBox * 3 + colSubBox;
    }
}
