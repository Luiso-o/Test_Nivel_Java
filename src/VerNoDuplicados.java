import java.util.*;

public class VerNoDuplicados {

    public static void main(String[] args) {

        VerNoDuplicados verNoDuplicados = new VerNoDuplicados();
        verNoDuplicados.getOnlyNotDuplicatesList(Arrays.asList(1,2,3,3,4,4,5,6,7,1,9,3,2,3,5,8));
    }

    private void getOnlyNotDuplicatesList(List<Integer> list){
        Set<Integer> set =  new HashSet<>(list);
        set.forEach(System.out::println);
    }

}
