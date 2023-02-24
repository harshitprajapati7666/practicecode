public class PeakNumber {
    private static int[] array = {1, 3, 3, 5, 6, 8, 5};

    public static void main(String[] args) {
        printPeakNumbersNormal();
    }

    public static void printPeakNumbersNormal() {
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] >= array[i - 1] && array[i] >= array[i + 1])
                System.out.println(array[i] + " is a peak number");
        }
    }
}
