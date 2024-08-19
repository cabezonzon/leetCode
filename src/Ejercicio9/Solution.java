package Ejercicio9;

class Solution { //Greedy algorithm
    public boolean canJump(int[] nums) {
        int maxReach = 0; // Máximo índice que podemos alcanzar actualmente
        int sizeNums = nums.length; // Tamaño del array

        for (int i = 0; i < sizeNums; i++) {
            if (i > maxReach) {
                // Si el índice actual es mayor que el máximo alcance posible, no podemos
                // avanzar más
                return false;
            }
            // Actualiza el máximo alcance posible
            maxReach = Math.max(maxReach, i + nums[i]); // ya estamos en el indice i y podemos ir desde i + el valor actual
            // Si el máximo alcance es mayor o igual al último índice, podemos llegar al
            // final
            if (maxReach >= sizeNums - 1) {
                return true;
            }
        }

        // Si terminamos el bucle sin alcanzar el último índice, retornamos false
        return false;
    }
}
