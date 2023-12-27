import java.time.LocalDate;

/*Crea un metodo que reciba un anyo y imprima en pantalla si el anyo es bisiesto o no*/

public class Ejercicio_5 {

    public static void main(String[] args) {
        Ejercicio_5 esBisiesto = new Ejercicio_5();

        esBisiesto.isLeapYear(1991);
        esBisiesto.isLeapYear(1992);
    }

    private void isLeapYear(int year){
        boolean esBisiesto = LocalDate.of(year, 1, 1).isLeapYear();
        System.out.println(esBisiesto ? "Es bisiesto" : "No es bisiesto");
    }
}
