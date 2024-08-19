package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        int[] nums = {3, 2, 3, 4, 5};
        int val = 3;

        int result = removeElement(nums, val);
        System.out.println("Cantidad de elementos en nums que no son iguales a val: " + result);

    }

    public static int removeElement(int[] nums, int val) {
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
        // basicamente modificamos las primers tres posiciones y lo otro queda igual,
        for (int num : nums) {
            System.out.print(num + " ");
        }
        // k now represents the number of elements in nums which are not equal to val
        return k;
    }
}