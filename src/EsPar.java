//comprobar si un numero es par o impar
public class EsPar {

    public static void main(String[] args) {
        EsPar esPar = new EsPar();

        esPar.isPair(8);
        esPar.isPair(5);
        esPar.isPair(-8);
    }

    //Formato binario los números pares terminan en 0
    private void isPair(int number) {
        //Operación AND bit a bit (&):
        System.out.println((number & 1) == 0 ? "Es par" : "Es impar");
    }

}