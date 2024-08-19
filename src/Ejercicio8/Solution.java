package Ejercicio8;

class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            // If the price of the stock increases from the previous day, add the difference
            // to maxProfit
            if (prices[i] > prices[i - 1]) { //Para cada día, se verifica si el precio de la acción ha aumentado en comparación con el día anterior
                maxProfit += prices[i] - prices[i - 1];
            }
        }
        return maxProfit;

    }
}
