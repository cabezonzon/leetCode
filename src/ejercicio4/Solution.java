class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            // Si k es menor que 2, simplemente agregamos el elemento actual al principio
            // del arreglo.
            if (k < 2) {
                nums[k++] = nums[i];
            }
            // Si el elemento actual nums[i] es diferente del elemento dos lugares antes de
            // k,
            // significa que nums[i] es un elemento único o no excede el límite de dos
            // apariciones.
            else if (nums[i] != nums[k - 2]) { // cuando llega a esta condicion k es 2 siempre
                // Colocamos el elemento único en la posición k del arreglo nums.
                nums[k++] = nums[i];
            }
        }
        return k;
    }
}
