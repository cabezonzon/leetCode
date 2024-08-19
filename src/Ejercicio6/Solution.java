package Ejercicio6;

class Solution { // Reversal Algorithm
    public void rotate(int[] nums, int k) {
        int sizeNums = nums.length;
        int[] rotatedArray = new int[sizeNums];

        for (int i = 0; i < sizeNums; i++) {
            rotatedArray[(i + k) % sizeNums] = nums[i];
        }

        // Copy rotated array back to original nums array
        for (int i = 0; i < sizeNums; i++) {
            nums[i] = rotatedArray[i];
        }
    }
}
