/*Crea un metodo que determine si el numero recibido es capicua */

public class Ejercicio_6 {

    public static void main(String[] args) {

        Ejercicio_6 esCapicua = new Ejercicio_6();

        esCapicua.isCapicua(121);
        esCapicua.isCapicua2(143);

    }

    private void isCapicua(int number){
        String numberText = String.valueOf(number);
        String reverseNumber = new StringBuilder(numberText).reverse().toString();

        if(numberText.equals(reverseNumber)){
            System.out.println("Es capicua");
        }else{
            System.out.println("No es capicua");
        }
    }

    private void isCapicua2(int number){
        String numberText = String.valueOf(number);
        String reverseNumber = new StringBuilder(numberText).reverse().toString();

        System.out.println(numberText.equals(reverseNumber) ? "Es capicua" : "No es capicua");
    }

}
