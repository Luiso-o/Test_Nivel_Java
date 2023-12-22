public class InvertirCadena {

    //invirtiendo las letras de una cadena de texto
    public static void main(String[] args) {

    InvertirCadena invertirCadena = new InvertirCadena();

    invertirCadena.invertirTexto("Esta cadena se va a invertir");
    invertirCadena.invertirCadenaConBuilder("Esta también es una cadena invertida");

    }

    //creando el algoritmo
    private void invertirTexto (String texto){
        String[] cadena = texto.split("");
        StringBuilder textoInvertido = new StringBuilder();

        for (int i = cadena.length; i > 0; i--){
            textoInvertido.append(cadena[i - 1]);
        }
        System.out.println(textoInvertido);
    }

    //Usando el método reverse
    private void invertirCadenaConBuilder(String texto){
        String cadenaInvertida = new StringBuilder(texto).reverse().toString();
        System.out.println(cadenaInvertida);
    }
}