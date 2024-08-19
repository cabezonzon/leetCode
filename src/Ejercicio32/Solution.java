package Ejercicio32;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public String minWindow(String s, String t) {
        if (s == null || t == null || s.length() < t.length()) {
            return "";
        }

        // Mapa para contar los caracteres de t
        Map<Character, Integer> tFreq = new HashMap<>();
        for (char c : t.toCharArray()) {
            tFreq.put(c, tFreq.getOrDefault(c, 0) + 1); // esto busca la letra, si ya existe suma 1 y si no existe la agrega y suma 1
        }

        // Mapa para contar los caracteres en la ventana actual
        Map<Character, Integer> windowFreq = new HashMap<>();
        int left = 0, right = 0, valid = 0;
        int start = 0;
        int minLen = Integer.MAX_VALUE; // tama;o de la menor ventana encontrada hasta ahora

        while (right < s.length()) { // si el puntero derecho no pasa el size de s
            // Expande la ventana agregando un carácter
            char c = s.charAt(right);
            right++;
            if (tFreq.containsKey(c)) { // t contiene la letra actual de s
                windowFreq.put(c, windowFreq.getOrDefault(c, 0) + 1);
                if (windowFreq.get(c).intValue() == tFreq.get(c).intValue()) { // si la frecuencia en la ventana actual coincide con la frecuenca buscada tenemos un caracter valido
                    valid++;
                }
            }

            // Contrae la ventana hasta que deje de ser válida
            while (valid == tFreq.size()) {
                // Actualiza el tamaño mínimo de la ventana
                if (right - left < minLen) {
                    start = left; // el comienzo de la ventana
                    minLen = right - left; // distancia entre puntero derecho y izquierdo
                }

                // Quita un carácter del lado izquierdo de la ventana
                char d = s.charAt(left);
                left++;
                if (tFreq.containsKey(d)) {
                    if (windowFreq.get(d).intValue() == tFreq.get(d).intValue()) {
                        valid--;
                    }
                    windowFreq.put(d, windowFreq.get(d) - 1);
                }
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
}