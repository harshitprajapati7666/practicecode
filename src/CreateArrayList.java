import java.util.ArrayList;

public class CreateArrayList {
    // Write a program that iterates through an array and create an arraylist out of it
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            arrayList.add(array[i]);
        }
        System.out.println(arrayList);
    }
}