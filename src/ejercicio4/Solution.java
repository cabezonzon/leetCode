class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 2;

        for (int i = 2; i < nums.length; i++) {
            // Si el elemento actual nums[i] es diferente del elemento dos lugares antes de
            // k,
            // significa que nums[i] es un elemento único o no excede el límite de dos
            // apariciones.
            if (nums[i] != nums[k - 2]) { // cuando llega a esta condicion k es 2 siempre
                // Colocamos el elemento único en la posición k del arreglo nums.
                nums[k++] = nums[i];
            }
        }
        return k;
    }
}