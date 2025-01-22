import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalsTriangle2_119 {
    public static void main (String[] args) {
        int rowIndex = 2;

        PascalsTriangle2_119 obj = new PascalsTriangle2_119();
        List<Integer> result = obj.getRow(rowIndex);
        System.out.println(result);
    }

    public List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> pascalArray = new ArrayList<>();
        int counter = 0;
        if (rowIndex == 0) {
            pascalArray.add(1);
            return pascalArray;
        } else if (rowIndex == 1) {
            pascalArray.addAll(Arrays.asList(1, 1));
            return pascalArray;
        }
        pascalArray.addAll(Arrays.asList(1, 1));

        while (counter < rowIndex - 1) {
            ArrayList<Integer> tempArray = new ArrayList<>();
//            System.out.println("pascalArray => " + Arrays.deepToString(pascalArray.toArray()));
            tempArray.add(1);
            for (int i = 0; i < (pascalArray.size() - 1); i++) {
                tempArray.add(pascalArray.get(i) + pascalArray.get(i + 1));
//                System.out.println("tempArray => " + Arrays.deepToString(tempArray.toArray()));
            }
            tempArray.add(1);
            pascalArray = tempArray;
            counter++;
        }
        return pascalArray;
    }
}
