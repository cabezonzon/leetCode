package ejercicio3;

class Solution {
    public int removeDuplicates(int[] nums) {
        int uniqueCount = 1;

        for (int i = 1; i < nums.length; i++) { //empezamos por el segundo elemento, el primero queda
            if (nums[i] != nums[i - 1]) { // el elemento, es distinto al anterior? si, entonces lo agrega al array
                nums[uniqueCount] = nums[i];
                uniqueCount++;
            }
        }

        return uniqueCount;
    }
}