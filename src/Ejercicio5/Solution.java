package Ejercicio5;

class Solution { // Algoritmo  Boyer-Moore Voting, siempre tiene que haber un elemento mayoritario, array de 8 elementos, tiene que repetirse un elemento 5 veces
    public int majorityElement(int[] nums) {
        int count = 0;
        Integer candidate = null;

        // Iteramos sobre cada elemento del arreglo
        for (int i = 0; i < nums.length; i++) {
            // Si el contador es 0, asignamos el elemento actual como candidato
            if (count == 0) {
                candidate = nums[i];
            }

            // Si el elemento actual es igual al candidato, incrementamos el contador, de lo contrario, lo decrementamos
            count += (nums[i] == candidate) ? 1 : -1;
        }

        // El candidato restante es el elemento que aparece más de n/2 veces
        return candidate;
    }
}
