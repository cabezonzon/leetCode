package Ejercicio29;

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minLength = Integer.MAX_VALUE;
        int sum = 0;
        int start = 0;

        for (int end = 0; end < nums.length; end++) { // recorro el array de nums
            sum += nums[end];

            // El objetivo del bucle while es ajustar el tamaño de la ventana actual (sub array) para asegurarse de que la suma de los elementos dentro de la ventana sea mayor o igual al objetivo (target). Si la suma es mayor o igual al objetivo, intentamos minimizar la longitud de la ventana contrayéndola desde el inicio (start).
            while (sum >= target) { //  Esto significa que hemos encontrado un subarray cuya suma cumple con la condición y ahora queremos ver si podemos encontrar un subarray más pequeño que también cumpla la condición.
                minLength = Math.min(minLength, end - start + 1); // Aquí se actualiza minLength con la longitud del subarray actual (end - start + 1) si esta longitud es menor que el valor actual de minLength. La función Math.min se usa para asegurarse de que siempre mantenemos la longitud mínima encontrada hasta ahora.
                sum -= nums[start]; // Como estamos tratando de contraer la ventana desde el inicio (start), restamos el valor del elemento en nums[start] de sum. Esto es porque nums[start] ya no formará parte de la ventana después de mover el puntero start.
                start++;
            }
        }

        return (minLength == Integer.MAX_VALUE) ? 0 : minLength; // es igual valor inicial? devolve 0 sino el minLenght
    }
}