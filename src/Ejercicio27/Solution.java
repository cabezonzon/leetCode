package Ejercicio27;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            // Calcular el área con los punteros actuales left y right
            int currentArea = Math.min(height[left], height[right]) * (right - left); // (right - left) es la distancia horizontal, para calcular el area lo necesito
            // Actualizar maxArea si el área actual es mayor
            maxArea = Math.max(maxArea, currentArea);

            // Mover el puntero que está en la línea más corta
            if (height[left] < height[right]) { // Para potencialmente encontrar un área mayor, mueve el puntero que apunta a la línea más corta:
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}

