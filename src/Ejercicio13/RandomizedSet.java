package Ejercicio13;

import java.util.*;

class RandomizedSet {
    public int[] productExceptSelf(int[] nums) {
        int sizeNums = nums.length;

        // Arreglos para almacenar los productos a la izquierda y derecha de cada índice
        int[] leftProducts = new int[sizeNums];
        int[] rightProducts = new int[sizeNums];
        int[] answer = new int[sizeNums];

        // Inicializar leftProducts
        leftProducts[0] = 1; // No hay elementos a la izquierda del primer elemento
        for (int i = 1; i < sizeNums; i++) {
            leftProducts[i] = leftProducts[i - 1] * nums[i - 1];
        }

        // Inicializar rightProducts
        rightProducts[sizeNums - 1] = 1; // No hay elementos a la derecha del último elemento
        for (int i = sizeNums - 2; i >= 0; i--) { //Este bucle se inicializa en sizeNums - 2 y no en sizeNums - 1 porque el último elemento de rightProducts se inicializa en 1 fuera del bucle. Esto es porque no hay elementos a la derecha del último índice, así que el producto de los elementos a la derecha del último índice es simplemente 1.
            rightProducts[i] = rightProducts[i + 1] * nums[i + 1];
        }

        // Calcular el resultado multiplicando leftProducts y rightProducts
        for (int i = 0; i < sizeNums; i++) {
            answer[i] = leftProducts[i] * rightProducts[i];
        }

        return answer;
    }
}