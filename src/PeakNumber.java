public class PeakNumber {
    private static double[] array = {1, 3, 3, 5, 6, 8, 5};

    public static void main(String[] args) {

        printPeakNumbers();
    }

    public static void printPeakNumbers() {
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] >= array[i - 1] && array[i] >= array[i + 1])
                System.out.println(array[i] + " is a peak number");
        }
    }
}
