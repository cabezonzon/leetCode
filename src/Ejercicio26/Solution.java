package Ejercicio26;

class Solution {
    // se puede utilizar el algoritmo de dos punteros. Dado que el array está
    // ordenado en orden no decreciente, puedes usar un puntero al inicio del array
    // y otro al final del array.
    public int[] twoSum(int[] numbers, int target) {
        int left = 0; // Índice inicial
        int right = numbers.length - 1; // Índice final

        while (left < right) {
            int sum = numbers[left] + numbers[right]; // suma inicial primer elemento con el ultimo
            if (sum == target) {
                // Devuelve los índices 1-indexados
                return new int[]{left + 1, right + 1};
            } else if (sum < target) { //la suma es menor, necesito algo mayor, array ordenado por eso muevo este puntero
                // Si la suma es menor que el objetivo, mueve el puntero izquierdo a la derecha
                left++;
            } else {
                // Si la suma es mayor que el objetivo, mueve el puntero derecho a la izquierda
                right--;
            }
        }
        return new int[]{0, 0}; // no se deberia llegar aca
    }
}
