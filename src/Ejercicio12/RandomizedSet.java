package Ejercicio12;

import java.util.*;

class RandomizedSet {
    private Map<Integer, Integer> valueToIndexMap;
    private List<Integer> values;
    private Random random;

    public RandomizedSet() {
        valueToIndexMap = new HashMap<>(); // valueToIndexMap: Un HashMap que almacena el valor como clave y su índice en la lista values como valor.
        values = new ArrayList<>(); // values: Un ArrayList que almacena los valores reales.
        random = new Random();
    }

    public boolean insert(int val) {
        if (valueToIndexMap.containsKey(val)) { // verifica si existe el valor
            return false;
        }
        valueToIndexMap.put(val, values.size()); // no existe, almacena el valor como clave y el indice en donde esta ese valor
        values.add(val); // guarda el valor en la lista de valores
        return true;
    }

    public boolean remove(int val) {
        if (!valueToIndexMap.containsKey(val)) {
            return false;
        }
        int index = valueToIndexMap.get(val); // obtiene el indice en donde esta el valor a eliminar
        int lastValue = values.get(values.size() - 1); // obtiene el ultimo valor

        values.set(index, lastValue); //reemplaza el valor a eliminar con el ultimo, Esto asegura que no queden huecos en el ArrayList.
        valueToIndexMap.put(lastValue, index); // actualizamos el indice del ultimo valor

        values.remove(values.size() - 1); // Elimina el último elemento del ArrayList, ya que ahora ha sido movido a la posición index. Esto efectivamente elimina el valor original val del ArrayList.
        valueToIndexMap.remove(val); // tambien lo eliminamos del hashmap
        return true;
    }

    public int getRandom() {
        int randomIndex = random.nextInt(values.size()); // genera un número entero aleatorio entre 0 (inclusive) y values.size() (exclusivo).
        return values.get(randomIndex); // obtiene ese valor
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
