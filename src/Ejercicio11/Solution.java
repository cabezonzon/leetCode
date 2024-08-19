package Ejercicio11;

import java.util.Arrays;

class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations); // LAS ORDENO DE MENOR A MAYOR

        int researcherPublished = citations.length;
        for (int i = 0; i < researcherPublished; i++) {
            int hIndex = researcherPublished - i; // en el ejemplo cuando llego a 3, son tres citaciones, lo que viene despues no me interesa porque son valores menores
            if (citations[i] >= hIndex) {
                return hIndex;
            }
        }
        return 0;
    }
}
