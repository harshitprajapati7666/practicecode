import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import static java.util.Arrays.sort;

//  Implementation of all sorting algorithms
public class SortingAlgorithms {

    public static void selectionSort(int[] values) {
        int indexMinimum;
        for (int i = 0; i < values.length - 1; i++) {
            indexMinimum = i;
            for (int j = i + 1; j < values.length; j++) {
                if (values[j] < values[indexMinimum]) {
                    indexMinimum = j;
                }
            }
            swap(values, indexMinimum, i);
        }
    }

    public static void insertionSort(int[] values) {
        int currentIndex;
        for (int position = 1; position < values.length; position++) {
            currentIndex = position;
            while (currentIndex > 0 && values[currentIndex] < values[currentIndex - 1]) {
                swap(values, currentIndex, currentIndex - 1);
                currentIndex = currentIndex - 1;
            }
        }
    }

    public static void builtInSortAkaMergeSort(String[] args) {
        Random random = new Random();
        List<Integer> numsToSort = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numsToSort.add(random.nextInt(100));
        }
        Collections.sort(numsToSort);
        sort(new int[]{1, 4, 2});
        System.out.println("New array after builtin sort: " + numsToSort.toString());
    }

    private static void swap(int[] values, int indexMin, int i) {
        int temp = values[indexMin];
        values[indexMin] = values[i];
        values[i] = temp;
    }
}
