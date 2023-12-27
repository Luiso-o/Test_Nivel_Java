import java.util.Scanner;

/*Crea la lógica para gestionar los libres de un cinema*/

public class Ejercicio_14 {

    public static void main(String[] args) {
        //Variables
        char asientos[][] = new char[10][10];
        boolean bandera = false;
        Scanner input = new Scanner(System.in);
        int fila = 0, asiento = 0;
        String respuesta = "";

        //creamos la matriz de asientos
        for (int i = 0; i < 10; i++) { //fila
            for (int j = 0; j < 10; j++) { //columna
                asientos[i][j] = 'L';
            }
        }

        System.out.println("-----------BIENVENIDO AL SISTEMA DE RESERVA-----------\n");

        //empieza la reserva de asientos
        while (!bandera) {
            System.out.println("Desea ver el mapa de los asientos? S/si cualquier otra tecla/No\n");
            respuesta = input.next();

            //visualiza mapa
            if (respuesta.equalsIgnoreCase("S")) {
                dibujarMapa(asientos);
            }

            //reserva
            boolean disponible = false;
            while (!disponible) {
                System.out.println("\nIngrese Fila y Asiento a reservar");
                System.out.print("fila(entre 0 y 9): ");
                fila = input.nextInt();

                System.out.print("asiento(entre 0 y 9): ");
                asiento = input.nextInt();

                if (fila <= 9 && fila >= 0) {
                    if (asiento <= 9 && asiento >= 0) {
                        disponible = true;
                    } else {
                        System.out.println("El numero de asiento no es válido");
                    }
                } else {
                    System.out.println("El numero de fila no es válido");
                }
            }

            if (asientos[fila][asiento] == 'L') {
                asientos[fila][asiento] = 'X';
                System.out.println("El asiento fue reservado correctamente");

            } else {
                System.out.println("El asiento está ocupado. Por favor elija otro");
            }

            System.out.println("Desea finalizar la reserva? S/si cualquier otra tecla/No");
            respuesta = input.next();

            if (respuesta.equalsIgnoreCase("S")) {
                bandera = true;
            }
        }
        System.out.println("Saliendo del sistema");
    }

    static void dibujarMapa(char asientos[][]){
        for (int i = 0; i < 10 ; i++) { //fila
            System.out.print(i + " ");
            for (int j = 0; j < 10 ; j++) { //columna
                System.out.print("[" + asientos[i][j] + "]");
            }
            System.out.println("");
        }
    }

}
