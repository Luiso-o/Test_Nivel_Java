import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class DesordenarCadena {

    public static void main(String[] args) {
        DesordenarCadena desordenarCadena = new DesordenarCadena();
        desordenarCadena.randomOrder("Esta cadena de texto se desordenara");
    }

    private void randomOrder(String text){
        String[] array = text.split("");
        List<String> list = Arrays.asList(array);
        Collections.shuffle(list);
        list.forEach(System.out::print);
    }

}
