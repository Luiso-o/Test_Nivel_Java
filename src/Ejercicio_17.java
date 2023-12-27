/*Ejercicio_17.isOne(int firstNumber, int secondNumber) debe devolver
true si uno de los argumentos es 1 o si su suma es igual a 1.*/

public class Ejercicio_17 {

    public static void main(String[] args) {
        System.out.println(Ejercicio_17.isOne(1,5));//true
        System.out.println(Ejercicio_17.isOne(2,3));//false
        System.out.println(Ejercicio_17.isOne(-3,4));//true
    }

    static boolean isOne(int firstNumber, int secondNumber){
        return firstNumber == 1 || (secondNumber == 1 || (firstNumber + secondNumber == 1));
    }
}
