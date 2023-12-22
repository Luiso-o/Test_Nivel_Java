import java.util.Arrays;

public class HayUnaBocal {

    public static void main(String[] args) {

        HayUnaBocal hayUnaBocal = new HayUnaBocal();

        hayUnaBocal.checkIfVowelIsPresent("En este texto hay vocales?");
        hayUnaBocal.checkIfVowelIsPresent2("kjhfg");
        hayUnaBocal.checkIfVowelIsPresent3("kjhfg tiene vocales?");
    }

    private void checkIfVowelIsPresent(String text){
        String[] array = text.split("");

        boolean isPresent = false;

        for (String s: array) {
            if (s.equals("a") || s.equals("e") || s.equals("i") || s.equals("o") || s.equals("u")) {
                isPresent = true;
            }
        }
        System.out.println(isPresent);
    }

    private void checkIfVowelIsPresent2(String text) {
        boolean result = text.matches(".*[aeiou].*");
        System.out.println(result);
    }

    private void checkIfVowelIsPresent3(String text) {
      boolean result =  Arrays.asList(text.split("")).stream().anyMatch(s -> s.equals("a") || s.equals("e") || s.equals("i") || s.equals("o") || s.equals("u"));
        System.out.println(result);
    }
}
