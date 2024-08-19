package Ejercicio33;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public boolean isValidSudoku(char[][] board) {

        // Inicializar conjuntos para realizar el seguimiento de los números vistos en
        // filas, columnas y sub-cuadros
        Set<Character>[] rows = new HashSet[9];
        Set<Character>[] cols = new HashSet[9];
        Set<Character>[] boxes = new HashSet[9];

        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        // Iterar sobre cada celda del tablero
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char num = board[i][j];
                if (num != '.') {
                    // Calcular el índice del sub-cuadro 3x3
                    int boxIndex = (i / 3) * 3 + (j / 3); // hay 9 cuadros por ese este calculo
//      cuadros       0 1 2
//                    3 4 5
//                    6 7 8

                    // Verificar si el número ya ha sido visto en la fila, columna o sub-cuadro
                    // actual
                    if (rows[i].contains(num)) {
                        return false;
                    }
                    if (cols[j].contains(num)) {
                        return false;
                    }
                    if (boxes[boxIndex].contains(num)) {
                        return false;
                    }

                    // Marcar el número como visto en la fila, columna y sub-cuadro actual
                    rows[i].add(num);
                    cols[j].add(num);
                    boxes[boxIndex].add(num);
                }
            }
        }

        // Si no se encontraron conflictos, el tablero es válido
        return true;
    }
}

// example 1
//rows[0] = { '5', '3', '7' };
//rows[1] = { '6', '1', '9', '5' };
//rows[2] = { '9', '8', '6' };
//rows[3] = { '8', '6', '3' };
//rows[4] = { '4', '8', '3', '1' };
//rows[5] = { '7', '2', '6' };
//rows[6] = { '6', '2', '8' };
//rows[7] = { '4', '1', '9', '5' };
//rows[8] = { '8', '7', '9' };

//cols[0] = { '5', '6', '8', '4', '7' };
//cols[1] = { '3', '9', '6', '1' };
//cols[2] = { '8' };
//cols[3] = { '1', '4' };
//cols[4] = { '7', '9', '1', '8' };
//cols[5] = { '5', '3' };
//cols[6] = { '2', '6' };
//cols[7] = { '8', '7' };
//cols[8] = { '5', '9', '2' };