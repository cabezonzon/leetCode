package Ejercicio10;

class Solution {
    public int jump(int[] nums) {
        int jumps = 0; // Contador de saltos.
        int currentEnd = 0; // El índice más lejano al que podemos llegar con el número actual de saltos.
        int farthest = 0; // El índice más lejano que podemos alcanzar desde los índices visitados hasta ahora.

        // Recorremos el array desde el primer elemento hasta el penúltimo.
        for (int i = 0; i < nums.length - 1; i++) {
            // Actualizamos el alcance máximo que podemos lograr desde el índice actual.
            farthest = Math.max(farthest, i + nums[i]);

            // Si hemos llegado al límite del alcance actual:
            if (i == currentEnd) {
                jumps++; // Incrementamos el número de saltos.
                currentEnd = farthest; // Actualizamos el límite del alcance al valor más lejano alcanzado.

                // Si el límite actualizado es mayor o igual al último índice, terminamos.
                if (currentEnd >= nums.length - 1) {
                    break;
                }
            }
        }

        // Devolvemos el número total de saltos necesarios para alcanzar el último índice.
        return jumps;
    }
}
