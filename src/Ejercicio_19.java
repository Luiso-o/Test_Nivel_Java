import java.util.Arrays;

/*El metodo sumRange debería devolver la suma de los enteros entre 10 y 100
inclusive contenidos en el arreglo pasado como parámetro
- el parametro ints nunca es nulo
*/

public class Ejercicio_19 {
    public static void main(String[] args) {
        int[] ints1 = {1,20,3,10,-2,100};
        int result = sumRange(ints1);
        System.out.println("Resultado: " + result + " expected result : 130");

        int[] ints2 = {30,4,9,12,98,-10,10};
        int result2 = sumRangeIterable(ints2);
        System.out.println("Resultado: " + result2 + " expected result : 150");
    }

    static int sumRange(int[] ints){
        int sum = 0;
        for (int i = 0; i < ints.length; i++) {
            int n = ints[i];
            if(n >= 10 && n <= 100)sum += n;
        }
        return sum;
    }

    static int sumRangeIterable(int[] ints){
       return Arrays.stream(ints)
               .filter(numero -> numero >= 10 && numero <= 100)
               .sum();
    }

}
