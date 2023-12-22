public class SumarCaracteres {

    //Sumar los caracteres de una cadena de texto
    public static void main(String[] args) {
        SumarCaracteres sumarCaracteres = new SumarCaracteres();

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
}
