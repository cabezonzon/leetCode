package Ejercicio17;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int romanToInt(String s) {
        // Create a map to store Roman numerals and their corresponding values
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int total = 0;
        int prevValue = 0;

        // Iterate through the string in reverse order
        for (int i = s.length() - 1; i >= 0; i--) {
            char currentChar = s.charAt(i);
            int currentValue = romanMap.get(currentChar);

            // If the current value is less than the previous value, subtract it from total
            if (currentValue < prevValue) { // Example IV, 1 - 5 = 4, rest currentValue
                total -= currentValue;
            } else {
                total += currentValue;
            }
            prevValue = currentValue;
        }

        return total;
    }
}