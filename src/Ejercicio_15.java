//Cuenta los caracteres de una cadena de texto

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ejercicio_15 {
    public static void main(String[] args) {
        Ejercicio_15 sumarCaracteres = new Ejercicio_15();

        sumarCaracteres.countCharacter("En este texto quiero saber el numero de caracteres que tiene");
    }

    private void countCharacter(String text) {
        int i, length, counter[] = new int[256];

        String lowerText = text.toLowerCase();
        length = text.length();

        System.out.println("\nEsta cadena tiene " + length + " caracteres repartidos de la siguiente manera: ");

        for (i = 0; i < length; i++) {
            char currentChar = lowerText.charAt(i);

            if(currentChar != ' '){
                counter[currentChar]++;
            }

        }

        for (i = 0; i < 256; i++) {
            if (counter[i] != 0) {
                System.out.println((char) i + " : " + counter[i]);
            }
        }
    }

    public static class VerNoDuplicados {

        public static void main(String[] args) {

            VerNoDuplicados verNoDuplicados = new VerNoDuplicados();
            verNoDuplicados.getOnlyNotDuplicatesList(Arrays.asList(1,2,3,3,4,4,5,6,7,1,9,3,2,3,5,8));
        }

        private void getOnlyNotDuplicatesList(List<Integer> list){
            Set<Integer> set =  new HashSet<>(list);
            set.forEach(System.out::println);
        }

    }
}
