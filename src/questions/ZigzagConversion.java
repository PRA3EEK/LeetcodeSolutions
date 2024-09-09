package questions;

import java.util.Arrays;

public class ZigzagConversion {

    public String convert(String s, int numRows) {
        String result = "";
        int currentRow = 1;
        int currentCol = 1;
        int[] rowAssign = new int[s.length()];
        if (numRows == 1) return s;
        for (int i = 0; i < s.length(); i++) {
            if (numRows == 2) {
                rowAssign[i] = currentRow++;
                if (currentRow > numRows) {
                    currentRow = 1;
                    currentCol++;
                }
            } else {
                if (currentCol % 2 != 0) {
                    rowAssign[i] = currentRow++;
                    if (currentRow > numRows) {
                        currentRow = numRows - 1;
                        currentCol++;
                    }
                } else {
                    rowAssign[i] = currentRow--;
                    if (currentRow < 2) {
                        currentRow = 1;
                        currentCol++;
                    }
                }
            }
        }
        for (int i = 1; i <= numRows; i++) {
            for (int j = 0; j < s.length(); j++) {
                if (rowAssign[j] == i) {
                    result += s.charAt(j);
                }
            }
        }
        return result;
    }
}
