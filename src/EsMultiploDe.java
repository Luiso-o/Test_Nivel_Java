public class EsMultiploDe {

    //Es multiplo de dos?
    public static void main(String[] args) {

        EsMultiploDe esMultiploDe = new EsMultiploDe();
        esMultiploDe.isMultiple(10);
        esMultiploDe.isMultiple(11);
    }

    private void isMultiple(int number){
        System.out.println(number % 2 == 0 ? "Es Multiplo" : "No es Multiplo");
    }
}
