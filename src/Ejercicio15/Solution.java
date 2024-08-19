package Ejercicio15;

class Solution {
    public int lengthOfLastWord(String s) {
        // Se utiliza para eliminar los espacios en blanco que se encuentran al principio y al final de la cadena
        s = s.trim();

        // Buscamos el ultimo espacio en la cadena despues de aplicarle trim
        int lastSpaceIndex = s.lastIndexOf(' ');

        //lastSpaceIndex: Este valor representa el índice (posición) del último espacio en la cadena s. Por ejemplo, en la cadena "Hello World", lastSpaceIndex sería 5 porque el último espacio está en la posición 5. lastSpaceIndex + 1: Sumamos 1 a lastSpaceIndex para obtener la posición inmediatamente después del último espacio. Esto nos da el índice del primer carácter de la última palabra. En el ejemplo, lastSpaceIndex + 1 sería 6.
        /*Por ejemplo, en la cadena "Hello World":
        s.length() es 11
        lastSpaceIndex es 5
        lastSpaceIndex + 1 es 6
        s.length() - (lastSpaceIndex + 1) es 11 - 6, que da 5, la longitud de la palabra "World". */
        return s.length() - (lastSpaceIndex + 1);
    }
}