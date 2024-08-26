package Ejercicio6;

class Solution { // Reversal Algorithm
    public void rotate(int[] nums, int k) {
        int sizeNums = nums.length;
        int[] rotatedArray = new int[sizeNums];

        for (int i = 0; i < sizeNums; i++) {
            rotatedArray[(i + k) % sizeNums] = nums[i]; //i + k, estamos determinando la nueva posición a la que debería moverse el elemento que está en la posición
            // % es el operador de módulo, que se utiliza para asegurarse de que los índices no se salgan del rango del array.
        }

        // Copy rotated array back to original nums array
        for (int i = 0; i < sizeNums; i++) {
            nums[i] = rotatedArray[i];
        }
    }
}
