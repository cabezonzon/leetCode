package Ejercicio20;

import java.util.LinkedHashMap;
import java.util.Map;

class Solution {
    public static String convert(String s, int numRows) {
        // If numRows is 1, no zigzag pattern is needed
        if (numRows == 1)
            return s;

        // Create an array of StringBuilder for each row
        StringBuilder[] rows = new StringBuilder[Math.min(numRows, s.length())]; // creo un array de String de size el valor menor entre el size de la palabra y las rows dadas.
        for (int i = 0; i < rows.length; i++) {
            rows[i] = new StringBuilder(); // por cada rows creo un string
        }

        // Use a variable to track the current row and direction
        int currentRow = 0;
        boolean goingDown = false;

        // Traverse the input string
        for (char c : s.toCharArray()) { // convertir el String en un array de Caracteres
            rows[currentRow].append(c);
            // Change direction if we are at the first or last row
            if (currentRow == 0 || currentRow == numRows - 1) {
                goingDown = !goingDown;
            }
            // Move to the next row in the current direction
            currentRow += goingDown ? 1 : -1; //mueve entre las rows, arriba o abajo
        }

        // Concatenate all rows to get the final result
        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }
        return result.toString();
    }
}