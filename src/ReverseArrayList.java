import java.util.ArrayList;

public class ReverseArrayList {
    public void reverseArrayList(ArrayList<Integer> list) {
        int i = 0, j = list.size() - 1;
        while (i < j) {
            Integer temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
            i++;
            j--;
        }
    }
    // Inbuilt method to reverse ArrayList - Collections.reverse()
}
