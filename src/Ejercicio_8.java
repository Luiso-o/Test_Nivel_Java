public class Ejercicio_8 {

    //Es multiplo de dos?
    public static void main(String[] args) {

        Ejercicio_8 esMultiploDe = new Ejercicio_8();
        esMultiploDe.isMultiple(10);
        esMultiploDe.isMultiple(11);
    }

    private void isMultiple(int number){
        System.out.println(number % 2 == 0 ? "Es Multiplo" : "No es Multiplo");
    }
}
