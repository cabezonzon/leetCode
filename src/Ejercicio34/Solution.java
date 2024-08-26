package Ejercicio34;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        int top = 0; // first rows
        int bottom = matrix.length - 1; // last row
        int left = 0; // first column
        int right = matrix[0].length - 1; // last column

        while (top <= bottom && left <= right) {
            // izquierda a derecha
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++; // eliminando filas de arriba hacia abajo

            // hacia abajo
            for (int i = top; i <= bottom; i++) { // desde el top++ porque el primer elemento ya fue agregado
                result.add(matrix[i][right]);
            }
            right--; // voy eliminado columnas de derecha a izquierda

            if (top <= bottom) { // quiere decir que quedan filas
                // Traverse from right to left
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--; // elimino filas de abajo hacia arriba
            }

            if (left <= right) { // quiere decir que quedan columnas
                // Traverse upwards
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }

        return result;
    }
}