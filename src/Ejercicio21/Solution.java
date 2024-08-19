package Ejercicio21;

class Solution {
    public static int candy(int[] ratings) {
        if (ratings == null || ratings.length == 0) {
            return 0;
        }

        int n = ratings.length;
        int[] candies = new int[n];

        // Inicializa cada posición con al menos 1 caramelo
        for (int i = 0; i < n; i++) {
            candies[i] = 1;
        }

        // Paso adelante: de izquierda a derecha
        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1]) { // si el actual es mayor al anterior sumo
                candies[i] = candies[i - 1] + 1;
            }
        }

        // Paso atrás: de derecha a izquierda
        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                candies[i] = Math.max(candies[i], candies[i + 1] + 1); // Usamos Math.max(candies[i], candies[i + 1] + 1) para garantizar que no reducimos el número de caramelos que el niño ya tiene. Esto es importante porque durante el paso adelante (de izquierda a derecha), ya hemos asignado caramelos basados en otras comparaciones.
            }
        }

        // Suma el total de caramelos
        int totalCandies = 0;
        for (int candy : candies) {
            totalCandies += candy;
        }

        return totalCandies;
    }
}