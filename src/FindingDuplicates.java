import java.util.HashSet;

public class FindingDuplicates {
    public void findDuplicates(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Element " + arr[i] + " is duplicate.");
                }
            }
        }
    }

    public void findDuplicatesOptimized(int[] arr) {
        var arraySet = new HashSet<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (arraySet.contains(arr[i])) {
                System.out.println("Element " + arr[i] + " is duplicate");
            } else {
                arraySet.add(arr[i]);
            }
        }
    }
}
