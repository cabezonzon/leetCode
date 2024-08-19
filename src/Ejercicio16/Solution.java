package Ejercicio16;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        // Inicializamos el prefijo con la primera cadena del array
        String prefix = strs[0];

        // Iteramos sobre las demás cadenas del array
        for (int i = 1; i < strs.length; i++) {
            // Mientras la cadena actual no comience con el prefijo
            while (strs[i].indexOf(prefix) != 0) { // cuando es 0 el prefijo esta en la cadena al comienzo
                // Reducimos el prefijo eliminando el último carácter
                prefix = prefix.substring(0, prefix.length() - 1);
                // Si el prefijo se vuelve vacío, retornamos una cadena vacía
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        // Retornamos el prefijo común más largo encontrado
        return prefix;
    }
}