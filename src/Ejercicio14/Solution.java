package Ejercicio14;

class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) { // If there exists a solution, it is guaranteed to be unique, esto me asegura que siempre hay una solucion, entonces no hay que recorrer todo el array de nuevo
        int totalTank = 0;
        int currentTank = 0;
        int startingStation = 0;

        for (int i = 0; i < gas.length; i++) {
            totalTank = totalTank + gas[i] - cost[i]; // esto no se reinica porque el recorrido es redondo, es decir si da negativo quiere decir que no se puede coompletar el circuito
            currentTank = currentTank + gas[i] - cost[i];

            // Si en cualquier momento el tanque actual es negativo,
            // significa que no podemos comenzar desde la estación 'startingStation'
            // Debemos comenzar desde la siguiente estación
            if (currentTank < 0 ) {
                startingStation = i + 1;
                currentTank = 0;
            }
        }

        // Si el tanque total es negativo, no es posible completar el recorrido
        return totalTank >= 0 ? startingStation : -1;
    }
}