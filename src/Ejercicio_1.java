/*
Implementa el metodo Algorithm.buildPanel(String content)
para que devuelva un panel con el contenido dentro de él.

La salida del metodo tiene que ser un array de String, una
posición por cada línea mostrada en la salida del ejemplo.

Example:
Entrada: This is a panel!
Salida: [*******,*This *,*is *,*a *,*panel! *,*******]

Y mostrado con un salto de línea por cada elemento quedaría:

*********
*This   *
*is     *
*a      *
*panel! *
*********
*/

import java.util.Arrays;

public class Ejercicio_1 {
    public static void main(String[] args) {
        buildPanel("This is a panel!");
    }

    static void buildPanel(String content) {

        String[] palabras = content.split(" ");
        String palabraMasLarga = encontrarPalabraMasLarga(palabras);
        int length = palabraMasLarga.length() + 3;

        System.out.println("*".repeat(length));

        for (String palabra : palabras){
            System.out.println("*" + palabra + " ".repeat((length - 2) - palabra.length()) + "*");
        }

        System.out.println("*".repeat(length));

    }

    static String encontrarPalabraMasLarga(String[] palabras) {
        if (palabras == null || palabras.length == 0) {
            return null;
        }

        return Arrays.stream(palabras)
                .max(java.util.Comparator.comparingInt(String::length))
                .orElse(null);
    }
}

