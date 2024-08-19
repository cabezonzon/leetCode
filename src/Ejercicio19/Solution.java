package Ejercicio19;

import java.util.LinkedHashMap;
import java.util.Map;

class Solution {
    public static String intToRoman(int num) {
        // Definir un LinkedHashMap para los símbolos de los números romanos y sus valores correspondientes
        Map<Integer, String> mapa = new LinkedHashMap<>();
        mapa.put(1000, "M");
        mapa.put(900, "CM");
        mapa.put(500, "D");
        mapa.put(400, "CD");
        mapa.put(100, "C");
        mapa.put(90, "XC");
        mapa.put(50, "L");
        mapa.put(40, "XL");
        mapa.put(10, "X");
        mapa.put(9, "IX");
        mapa.put(5, "V");
        mapa.put(4, "IV");
        mapa.put(1, "I");

        StringBuilder numeroRomano = new StringBuilder();

        for (Map.Entry<Integer, String> entrada : mapa.entrySet()) {
            int valor = entrada.getKey();
            String simbolo = entrada.getValue();
            // Determinar cuántas veces se puede restar el valor del símbolo del número dado
            while (num >= valor) {
                numeroRomano.append(simbolo);
                num -= valor; // resto el valor del simbolo que sume
            }
        }

        return numeroRomano.toString();
    }
}