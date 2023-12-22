public class OperadorIncremento {

    public static void main(String[] args) {

    /*Supongamos que b tiene el valor 5 y c el valor 8 en la siguiente expresión: "a = b++ + ++c;".
    ¿Cuál es el valor de a, b y c después de la ejecución de esta línea de código?*/
        int b = 5;
        int c = 8;

        int a = b++ + ++c;

        System.out.println("b : " + b);
        System.out.println("c : " + c);
        System.out.println("b++ : " + b++);
        System.out.println("++c : " + ++c);
        System.out.println(b + " + ++c : a");
        System.out.println("b++ + " + c + " : a");
        System.out.println("b++ + ++c : " + a);
        System.out.println(b + " + " + c + " = " + a);

        /*
        1) b++: El operador de post-incremento (++) incrementa el valor de b después
        de que su valor actual se utiliza en la expresión. Por lo tanto, inicialmente,
        b es 5, y después de esta operación, b se convierte en 6. La expresión evalúa a
        la versión original de b, que es 5.

        2) ++c: El operador de pre-incremento también incrementa el valor de c, pero lo hace
        antes de que se utilice en la expresión. En este caso, inicialmente, c es 8,
        y después de esta operación, c se convierte en 9. La expresión evalúa a
        la versión incrementada de c, que es 9.

        3) b++ + ++c: Ahora, sustituimos los valores en la expresión original: 5 + 9.
        Esto da como resultado 14.

        4) int a = 14;: Finalmente, el resultado de la expresión se asigna a la variable a,
         por lo que después de estas operaciones, a será igual a 14.*/

    }
}

