import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*Crea un metodo que reciba una cadena
de texto y devuelva la misma cadena con
los caracteres desordenados*/

public class Ejercicio_4 {

    public static void main(String[] args) {
        Ejercicio_4 desordenarCadena = new Ejercicio_4();
        desordenarCadena.randomOrder("Esta cadena de texto se desordenara");
    }

    private void randomOrder(String text){
        String[] array = text.split("");
        List<String> list = Arrays.asList(array);
        Collections.shuffle(list);
        list.forEach(System.out::print);
    }

}
