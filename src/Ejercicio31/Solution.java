package Ejercicio31;

import java.util.*;

class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();
        if (s == null || words == null || words.length == 0)
            return result;

        int wordCount = words.length; // cantidad de palabras
        int wordLength = words[0].length(); // todas las palabras tiene el mismo size
        int totalLength = wordCount * wordLength; // total size de las palabras juntas

        // Build the word frequency map
        Map<String, Integer> wordMap = new HashMap<>();
        for (String word : words) {
            wordMap.put(word, wordMap.getOrDefault(word, 0) + 1); // si existe la palabra le suma uno a la frecuencia si no existe la agrega con frecuencia 1
        }

        // Slide window across the string `s`
        for (int i = 0; i < wordLength; i++) {
            int left = i;
            int right = i;
            Map<String, Integer> seenWords = new HashMap<>();

            while (right + wordLength <= s.length()) {
                // Get the current word from the right end
                String word = s.substring(right, right + wordLength);
                right += wordLength;

                // If the word is not in the original word list, reset the window
                if (!wordMap.containsKey(word)) {
                    seenWords.clear();
                    left = right;
                    continue;
                }

                // Add the current word to the seenWords map
                seenWords.put(word, seenWords.getOrDefault(word, 0) + 1);

                // If the frequency exceeds, slide the window from the left
                while (seenWords.get(word) > wordMap.get(word)) {
                    String leftWord = s.substring(left, left + wordLength);
                    seenWords.put(leftWord, seenWords.get(leftWord) - 1);
                    left += wordLength;
                }

                // Check if the current window is valid
                if (right - left == totalLength) {
                    result.add(left);
                }
            }
        }
        return result;
    }
}