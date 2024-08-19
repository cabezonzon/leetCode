package Ejercicio22;

class Solution {
    public int trap(int[] height) {

        // Inicializamos dos punteros, uno al principio (left) y otro al final (right)
        // del array.
        int left = 0;
        int right = height.length - 1;

        // Variables para almacenar la altura máxima encontrada desde la izquierda y
        // desde la derecha.
        int leftMax = 0;
        int rightMax = 0;

        // Variable para acumular la cantidad de agua atrapada.
        int trappedWater = 0;

        // Mientras el puntero izquierdo sea menor que el puntero derecho.
        while (left < right) {
            // Si la altura en la posición del puntero izquierdo es menor que la altura en
            // la posición del puntero derecho.
            if (height[left] < height[right]) {
                // Si la altura en la posición izquierda actual es mayor o igual a la altura
                // máxima desde la izquierda,
                // actualizamos leftMax con esta nueva altura.
                if (height[left] >= leftMax) {
                    leftMax = height[left];
                } else {
                    // Si la altura en la posición izquierda actual es menor que leftMax,
                    // significa que esta posición puede atrapar agua. La cantidad de agua atrapada
                    // es la diferencia
                    // entre leftMax y la altura en la posición izquierda actual.
                    trappedWater += leftMax - height[left];
                }
                // Movemos el puntero izquierdo hacia la derecha.
                left++;
            } else {
                // Si la altura en la posición del puntero derecho es mayor o igual a la altura
                // en la posición del puntero izquierdo.
                if (height[right] >= rightMax) {
                    // Si la altura en la posición derecha actual es mayor o igual a la altura
                    // máxima desde la derecha,
                    // actualizamos rightMax con esta nueva altura.
                    rightMax = height[right];
                } else {
                    // Si la altura en la posición derecha actual es menor que rightMax,
                    // significa que esta posición puede atrapar agua. La cantidad de agua atrapada
                    // es la diferencia
                    // entre rightMax y la altura en la posición derecha actual.
                    trappedWater += rightMax - height[right];
                }
                // Movemos el puntero derecho hacia la izquierda.
                right--;
            }
        }

        // Retornamos la cantidad total de agua atrapada.
        return trappedWater;
    }
}