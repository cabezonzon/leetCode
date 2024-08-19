package Ejercicio23;

class Solution {
    public String reverseWords(String s) {
        // Split the string by one or more spaces
        String[] words = s.trim().split("\\s+"); // split devuelve un array de strings

        // Reverse the words
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i != 0) { // para no poner un espacio al final
                reversed.append(" ");
            }
        }

        return reversed.toString();
    }
}