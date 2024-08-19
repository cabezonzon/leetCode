package Ejercicio30;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Conjunto para almacenar caracteres únicos
        Set<Character> set = new HashSet<>();
        int maxLength = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            // Si encontramos un carácter repetido, movemos el puntero izquierdo hasta que
            // no haya duplicados
            while (set.contains(s.charAt(right))) { // el set contiene el elemento actual del for?
                set.remove(s.charAt(left)); // eliminamos el elemento de la izquierda
                left++; // y movemos la ventana
            } //esto sale de aca pero igual agrega el caracter actual al set, lo cual esta bien
            // Agregamos el carácter actual al conjunto
            set.add(s.charAt(right));
            // Calculamos la longitud máxima del substring sin caracteres repetidos
            maxLength = Math.max(maxLength, right - left + 1); //Al agregar +1, estamos incluyendo el carácter en el índice right en la longitud del substring
        }
        return maxLength;
    }
}