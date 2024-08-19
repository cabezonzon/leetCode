package Ejercicio24;

class Solution {
    public boolean isPalindrome(String s) {
        String cleaned = s.trim().replaceAll("\\s+", "").toLowerCase().replaceAll("[^a-zA-Z0-9]", ""); // trim elimina
        // espacios en blanco
        // al principio y fin
        // de la cadena, \\s+
        // entre medio de las
        // palabras. [^a-z]",
        // ""): Elimina todos
        // los caracteres que
        // no sean letras
        // minúsculas.

        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);

//         Limpiar la cadena para conservar solo caracteres alfanuméricos y convertir a minúsculas
//        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
//
//        // Verificar si la cadena limpiada es un palíndromo usando un bucle for
//        int length = cleaned.length();
//        for (int i = 0; i < length / 2; i++) { // Recorrer solo la primera mitad de la cadena
//            if (cleaned.charAt(i) != cleaned.charAt(length - 1 - i)) { // Comparar caracteres de los extremos hacia el centro
//                return false; // Si cualquier par de caracteres no coincide, no es un palíndromo
//            }
//        }
//
//        return true; // Si todos los pares de caracteres coinciden, es un palíndromo
//    }
    }
}