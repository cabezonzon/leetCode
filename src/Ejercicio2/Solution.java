package Ejercicio2;

class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0; // Position to overwrite with non-val elements

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // If the current element is not equal to val
            if (nums[i] != val) {
                // Overwrite nums[k] with the current element
                nums[k] = nums[i];
                // Move to the next position to overwrite
                k++;
            }
        }

        // k now represents the number of elements in nums which are not equal to val
        return k;
    }
}