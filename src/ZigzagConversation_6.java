import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class ZigzagConversation_6 {
    public static void main (String[] args) {
        String s = "PAYPALISHIRING";
//        String s = "A";
        int numRows = 1;
        ZigzagConversation_6 obj = new ZigzagConversation_6();
        String result = obj.convert(s, numRows);
        System.out.println(result);
    }

    public String convert(String s, int numRows) {
        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }
        List<List<Character>> zigzagMatrix = new ArrayList<>();

        int idx = 0, d = 1;
        for (int i = 0; i < numRows; i++) {
            zigzagMatrix.add(new ArrayList<>());
        }

        for (char ch : s.toCharArray()) {
            zigzagMatrix.get(idx).add(ch);

            if (idx == 0) {
                d = 1;
            } else if (idx == (numRows-1)) {
                d = -1;
            }
            idx += d;
        }

        StringBuilder returnStr = new StringBuilder();
        for (List<Character> row : zigzagMatrix) {
            for (Character ch : row) {
                returnStr.append(ch);
            }
        }
        System.out.println(zigzagMatrix.toString());
        System.out.println(returnStr.toString());
        return returnStr.toString();
    }
}


//P           H
//A       S   I
//Y    I      R
//P L         I  G
//A           N