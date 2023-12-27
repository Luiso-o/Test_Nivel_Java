import java.util.InputMismatchException;
import java.util.Scanner;

//crea un algoritmo para generar la secuencia de Collatz
public class Ejercicio_3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Ingresa un número entero positivo");
        int numeroControlado = controlaEntrada(input.nextInt());

        calcularSecuenciaCollatz(numeroControlado);

        input.close();
    }

    static void calcularSecuenciaCollatz(int numero){
        System.out.print("Secuencia de Collatz del numero " + numero + ":\n");
        do{
            int resultado = (numero % 2 == 0) ? (numero /= 2) : ((numero = (numero * 3) + 1));
                System.out.print(resultado + " ");

        }while (numero != 1);
        System.out.println("\n");
    }

    static int controlaEntrada(int numero){
        Scanner input = new Scanner(System.in);
        while (!(numero > 0)) {
            System.out.println("El número ingresado es incorrecto, por favor ingresa un número válido:");
            try{
                numero = input.nextInt();
            }catch (InputMismatchException e) {
                System.out.println("Error: Ingresa un número entero válido.");
                input.nextLine();
            }
        }
        input.close();
        return numero;
    }

}
