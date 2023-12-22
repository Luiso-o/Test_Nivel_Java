public class CaracteresRepetidos {

    //numeros de caracteres repetidos
    public static void main(String[] args) {
        CaracteresRepetidos caracteresRepetidos = new CaracteresRepetidos();
        caracteresRepetidos.repeatCharacter("En este texto quiero saber cuantos caracteres repetidos existen");
    }

    private void repeatCharacter(String text) {
        int i, length, counter[] = new int[256];

        String lowerText = text.toLowerCase();
        length = text.length();

        System.out.println("\nEsta cadena tiene " + length + " de los cuales los siguientes están repetidos: ");

        for (i = 0; i < length; i++) {
            char currentChar = lowerText.charAt(i);

            if(currentChar != ' '){
                counter[currentChar]++;
            }

        }

        for (i = 0; i < 256; i++) {
            if (counter[i] > 1) {
                System.out.println((char) i + " : " + counter[i]);
            }
        }
    }
}
