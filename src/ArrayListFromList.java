import java.util.ArrayList;
import java.util.List;

public class ArrayListFromList {

    public static void main(String[] args) {

        List<Integer> list = List.of(1, 2, 3, 4, 5);
        ArrayList<Integer> arrayList = new ArrayList<>(list);
        System.out.println(arrayList);
    }
}
