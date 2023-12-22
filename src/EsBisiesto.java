import java.time.LocalDate;

public class EsBisiesto {

    public static void main(String[] args) {
        EsBisiesto esBisiesto = new EsBisiesto();

        esBisiesto.isLeapYear(1991);
        esBisiesto.isLeapYear(1992);
    }

    private void isLeapYear(int year){
        boolean esBisiesto = LocalDate.of(year, 1, 1).isLeapYear();
        System.out.println(esBisiesto ? "Es viciesto" : "No es viciesto");
    }
}
