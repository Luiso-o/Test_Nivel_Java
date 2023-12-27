/*
El objetivo de este ejercicio es verificar la presencia de un número en un arreglo.

Especificaciones
 * Los elementos son números enteros ordenados de menor a mayor
 * El arreglo puede contener hasta 1 millón de elementos
 * El arreglo nunca es null

 Implementar el método boolean exists(int[] ints, int k)para que resuelva true si k pertenece a ints,
 en caso contrario, el metodo debe devolver false.

 Importante: intente ahorrar ciclos en la CPU, si es posible.

 Ejemplo:
 int[] ints = {-9, 14, 37, 102};
 exists(ints, 102) devuelve true
 exists(ints, 36) devuelve false
* */

import java.util.Arrays;

public class Ejercicio_16 {

    public static void main(String[] args) {
        int[] ints = {-9, 14, 37, 102};

        Arrays.sort(ints);

        System.out.println(exists(ints,102));//true
        System.out.println(exists(ints,36));//false
    }

    static boolean exists(int[] ints, int k){
        int index = Arrays.binarySearch(ints, k);
        return index >= 0;
    }

}
