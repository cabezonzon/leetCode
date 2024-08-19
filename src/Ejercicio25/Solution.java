package Ejercicio25;

class Solution {
    public boolean isSubsequence(String s, String t) {
        int sIndex = 0;
        int tIndex = 0;

        while (sIndex < s.length() && tIndex < t.length()) {
            if (s.charAt(sIndex) == t.charAt(tIndex)) {
                sIndex++; // si es igual incremento el indice de S
            }
            tIndex++; // si no es igual incremento el de T asi sigo buscando
        }

        return sIndex == s.length(); //Si sIndex es igual a la longitud de s, significa que se encontraron todos los caracteres de s en t en el orden correcto, y por lo tanto, s es una subsecuencia de t.
    }
}
