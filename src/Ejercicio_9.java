/*Crea la lógica para determinar si una palabra es palindromo o no*/

public class Ejercicio_9 {

    public static void main(String[] args) {
        Ejercicio_9 esPalindromo = new Ejercicio_9();

        System.out.println(esPalindromo.isPalindrom("oro"));
        System.out.println(esPalindromo.isPalindrom("aro"));

    }

    private boolean isPalindrom(String text){
        boolean result = true;
        int lenght = text.length();

        for (int i = 0; i < lenght/2; i++){
            if(text.charAt(i) != text.charAt(lenght -i -1)){
                result = false;
                break;
            }
        }
        return result;
    }
}
